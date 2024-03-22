import java.io.File;

public class DeletingFileExample {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Subhrajit\\Desktop\\FileHandling\\Hello.txt");
        if(f.delete()){
            System.out.println("File deleted");
        }
        else{
            System.out.println("An unexpected error has occurred");
        }
    }
}
