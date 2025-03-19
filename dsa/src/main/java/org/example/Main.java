package org.example;

import com.sun.security.jgss.GSSUtil;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.Header;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Duration duration = main.getMp3Duration(Path.of("/home/sequoia_phan/development/java/dsa/src/main/resources/save_your_tears.mp3"));
        System.out.println(duration.getSeconds() + " seconds");
    }

    Duration getMp3Duration(Path path) {
        try {
            InputStream inputStream = Files.newInputStream(path);
            Header header = new Bitstream(inputStream).readFrame();
            int size = (int) Files.size(path);
            return Duration.ofMillis((long) header.totalMs(size));
        } catch (IOException | BitstreamException e) {
            System.out.println("exception");
            return Duration.ZERO;
        }
    }

}