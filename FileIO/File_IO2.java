package FileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class File_IO2 {

    public static void main(String[] args) {
        // we created the file
        File example = new File("example.txt");

        try { // were checking if the file was just created or if it already existed
            File file = new File("example.txt");
            boolean IsCreated = example.createNewFile();

            if (IsCreated) {
                System.out.println("The file was created successfuly");
            } else {
                System.out.println("The file was already created previously");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        String info = "This will be in the file 'example'"; // the information tha twill be written into the file

        try {
            FileWriter fileWrite = new FileWriter("example.txt");

            fileWrite.write(info); // writing into the file
            System.out.println("The info was written into the file");

            fileWrite.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

        char[] charAmount = new char[100]; // the amount of characters in the output of this function

        try {
            FileReader fileRead = new FileReader("example.txt");

            fileRead.read(charAmount); // reading from the file
            System.out.println("This is the info in the file:");
            System.out.println(charAmount); // printing out the information on the file

            fileRead.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
