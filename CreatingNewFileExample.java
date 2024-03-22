import java.io.File;
import java.io.IOException;

public class CreatingNewFileExample {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Subhrajit\\Desktop\\FileHandling\\Hello.txt");
        if(f.createNewFile()){
            System.out.println("File created");
        }
        else{
            System.out.println("File already exists");
        }
    }
}
