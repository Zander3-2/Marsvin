package MarsvinTest.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filereader {
    public class ReadFile {
        public static void main(String[] args) {
            File Marsvin = new File("marsvin.txt");

            try (Scanner myReader = new Scanner(Marsvin)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);

                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}

