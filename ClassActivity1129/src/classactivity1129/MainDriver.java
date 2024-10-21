package classactivity1129;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author ayden
 */
public class MainDriver {
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        File fileIn = new File("Input.txt");
        Scanner fileRead = new Scanner(fileIn);
        
        PrintWriter fileWriter = new PrintWriter("Output.txt");
        
        
            while(fileRead.hasNextLine()){
                String line = fileRead.nextLine();
                System.out.println(line);
            }
            
            for(int i=0; i<5; ++i){
                fileWriter.println("Hello world");
            }
            fileWriter.close();
        }
        catch(FileNotFoundException e){ 
            System.out.println("File not found");
        }
        
        finally{
            System.out.println("Hello java");
        }
    }
}
