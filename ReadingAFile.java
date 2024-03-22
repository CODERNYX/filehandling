import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingAFile {
    public static void main(String[] args) throws IOException {

        //Reading a file using Scanner Class
        File f1 = new File("C:\\Users\\Subhrajit\\Desktop\\FileHandling\\Hello.txt");
        Scanner reader = new Scanner(f1);
        System.out.println("Reading the file contents using Scanner class");
        while (reader.hasNextLine()){
            String fileData = reader.nextLine();
            System.out.println(fileData);
        }
        reader.close();
        System.out.println();


        //Reading a file using FileReader class
        FileReader fr = new FileReader("C:\\Users\\Subhrajit\\Desktop\\FileHandling\\Hello.txt");
        int i;
        System.out.println("Reading the file contents using FileReader class");
        while((i=fr.read())!=-1){
            System.out.print((char) i);
        }
        fr.close();
        System.out.println();
    }
}
