package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        // ask questions
        String q1 = "Do you like eating vegetables?";

        // ask question to user
        writer.write(q1);

        // read response
        writer.writeAnswer(reader.readLine());

        // allow user to read our response
        reader.readLine();
    }
}