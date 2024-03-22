import java.io.*;

public class FileHandlingUsingBufferedReaderAndWriter {
    public static void main(String[] args) throws IOException {

        //Writing into a file using BufferedWriter class
        FileWriter fw = new FileWriter("C:\\Users\\Subhrajit\\Desktop\\FileHandling\\Hello.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Welcome to Java");
        bw.flush();
        bw.close();
        fw.close();
        System.out.println("Contents written to the file successfully");

        //Reading the contents of the file using BufferedReader class
        FileReader fr = new FileReader("C:\\Users\\Subhrajit\\Desktop\\FileHandling\\Hello.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        System.out.println();
        br.close();
        fr.close();

        //Appending contents into file using BufferedWriter class
        FileWriter fw2 = new FileWriter(
                "C:\\Users\\Subhrajit\\Desktop\\FileHandling\\Hello.txt",
                true);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        String s = "\nHello, There!";
        bw2.append(s,0,s.length());
        bw2.flush();
        bw2.close();
        fw2.close();
        System.out.println("Contents appended successfully");
    }
}
