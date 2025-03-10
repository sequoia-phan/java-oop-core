package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {

    DailyAdviceClient() {}

    public void go() {
        try{
            Socket s = new Socket("127.0.0.1",4242 );
            InputStreamReader inputStreamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String advice = reader.readLine();
            System.out.println("Today you should"+advice);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
