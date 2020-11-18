package com.hz;

public class ConsoleWriter extends Console {

    public String write(String msg) {
        System.out.println(msg);
        return msg;
    }

    public String writeAnswer(String answer) {
        Console console = new Console();

        if(console.answer(answer)) {
            return this.write("Very healthy!");
        } else {
            return this.write("Maybe you should try to eat some carrots");
        }
    }
}