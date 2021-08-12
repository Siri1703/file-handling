import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class appending {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("sample.txt",true);
        BufferedWriter b=new BufferedWriter(f);
        b.write("\n The data is being appended");
        System.out.println("append successfully");
        b.close();
    }
}
