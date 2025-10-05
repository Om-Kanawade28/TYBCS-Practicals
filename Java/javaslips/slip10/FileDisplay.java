
import java.util.*;
import java.io.*;
import java.lang.*;
public class FileDisplay {
    public static void main(String args[]){
        try{
        FileReader fp = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fp);
        String line;
        int c=0;
        StringBuffer content = new StringBuffer();
        while((line = br.readLine())!=null){
            System.out.println(line.toUpperCase());
             c++;
             content.append(line).append("\n");

        }
        System.out.println(content.reverse());
        
       
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
