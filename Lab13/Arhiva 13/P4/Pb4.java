package Laborator13.P4;
import java.io.File;
import java.io.FileReader;
import java.io.StreamTokenizer;

public class Pb4 {
    public static void main(String[] args) {
        FileReader input = null;
        StreamTokenizer stream = null;
        int cuvinte = 0;
        try {
            input = new FileReader(new File("C:\\Users\\ionit\\Desktop\\FACULTATE\\An2\\POO\\java\\Arhiva 13\\P4\\test02.in"));
            stream = new StreamTokenizer(input);


            stream.wordChars('A', 'Z');
            stream.wordChars('a', 'z');
            stream.whitespaceChars(0, 64);
            stream.whitespaceChars(91, 96);
            stream.whitespaceChars(123, 255);

            while (stream.nextToken() != stream.TT_EOF) {
                System.out.println(stream.sval);
                cuvinte++;
            }

            System.out.println(cuvinte);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null)
                    input.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}