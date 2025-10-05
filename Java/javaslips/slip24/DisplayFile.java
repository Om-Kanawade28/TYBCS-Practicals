package slip24;
import java.io.*;
public class DisplayFile {
    public static void main(String args[]){
        if(args[0].length()  == 0){
            System.out.println("Ennter the File name please:=");

        }
        try{
     
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        }catch(Exception e){
            System.out.println("Not found");
        }
        

    }
    
}
