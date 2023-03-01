package Laborator13.P2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.IOException;


public class pb2 {
    public static void main(String[] args) {
        FileReader file = null;
        LineNumberReader reader = null;
        String str;
        int line;

        try {
            file = new FileReader("C:\\Users\\ionit\\Desktop\\FACULTATE\\An2\\POO\\java\\Arhiva 13\\P2\\test01.in");
            reader = new LineNumberReader(file);

            while ((str = reader.readLine()) != null) {
                line = reader.getLineNumber();

                if (line % 2 != 0) {
                    System.out.println(line + ": " + str);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (file != null)
                    file.close();

                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}