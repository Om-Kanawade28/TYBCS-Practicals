import java.util.*;
import java.io.*;

public class CopyFile {
    public static void main(String args[]){
        try{
            FileReader rf = new FileReader(args[0]);
            FileWriter wf = new FileWriter(args[1]);
            BufferedReader rb = new BufferedReader(rf);
            BufferedWriter wb = new BufferedWriter(wf);
            String ch;
            while((ch=rb.readLine()) != null){
                  wb.write(ch);
                  wb.newLine(); 
            }
            rb.close();
            wb.close();
        }catch(Exception e){
             System.out.println(e);
        }
    }
    
}
