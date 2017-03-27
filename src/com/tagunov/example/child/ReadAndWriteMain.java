package com.tagunov.example.child;

import java.io.IOException;

public class ReadAndWriteMain {

    public static void main(String[] args) throws IOException {
        ReadAndWrite test1;
        test1 = new ReadAndWrite("E:\\java\\text.txt");
        ReadAndWrite test2;
        test2 = new ReadAndWrite("E:\\java\\text1.txt");

        test1.ReadFile();
        test2.ReadFile();

        test1.WriteFile();
        test2.WriteFile();

        test1.ReadFile();
        test2.ReadFile();
    }
}