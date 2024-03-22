import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFileUsingFileWriter {
    public static void main(String[] args) throws IOException {

        //Writing new Content into the file.
        FileWriter fw = new FileWriter(
                "C:\\Users\\Subhrajit\\Desktop\\FileHandling\\Hello.txt");
        fw.write("Hello, There!");
        fw.flush();
        fw.close();
        System.out.println("Content is successfully written in file");

        //Appending into the file
        FileWriter fw2 = new FileWriter(
                "C:\\Users\\Subhrajit\\Desktop\\FileHandling\\Hello.txt"
                ,true);
        fw2.write("\nHello! I am the appended line in here");
        fw2.flush();
        fw2.close();
        System.out.println("Content is successfully appended to the file");
    }
}
