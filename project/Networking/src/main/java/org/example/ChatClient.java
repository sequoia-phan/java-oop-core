package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.lang.Thread;

public class ChatClient {
    JTextArea inComing;
    JTextField outGoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

    public ChatClient() {
    }

    void go() {
        // make gui
        JFrame frame = new JFrame("Simple chat client");
        JPanel mainPanel = new JPanel();
        this.inComing = new JTextArea(15,50);
        this.inComing.setLineWrap(true);
        this.inComing.setWrapStyleWord(true);
        this.inComing.setEditable(false);

        JScrollPane qScroller = new JScrollPane(inComing);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        this.outGoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(qScroller);
        mainPanel.add(this.outGoing);
        mainPanel.add(sendButton);
        this.setupNetworking();

        Thread thread = new Thread(new IncomingReader());
        thread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }

    private void setupNetworking() {
        // make a sock
        try{
            this.sock = new Socket("127.0.0.1", 5000);
            InputStreamReader streamReader = new InputStreamReader(this.sock.getInputStream());
            this.reader = new BufferedReader(streamReader);
            this.writer = new PrintWriter(this.sock.getOutputStream());
            System.out.println("Networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class SendButtonListener implements ActionListener {

        public SendButtonListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                writer.println(outGoing.getText());
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            outGoing.setText("");
            outGoing.requestFocus();
        }
    }
}
