package com.tagunov.example.child;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.Buffer;

/**
 * Created by Vadim on 27.03.2017.
 */
class ReadAndWrite {
// nemnogo test
// pizdato!!!
    private String FILENAME = null;

    public ReadAndWrite(String address) {
        FILENAME = address;
    }

    public void ReadFile() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(FILENAME));
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        }  catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            br.close();
        }
    }

    public void WriteFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Enter your data:");
            String content = reader.readLine();

            bw.write(content);

            // no need to close it.
            //bw.close();

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}