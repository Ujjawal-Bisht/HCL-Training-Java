package Dayo8;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCount {
    public static void main(String[] args) {
        int count = 0;

        try {
            FileReader fr = new FileReader("input.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                count++;
            }

            fr.close();

            System.out.println("Total characters = " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}