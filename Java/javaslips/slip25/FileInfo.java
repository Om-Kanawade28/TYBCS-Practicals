import java.io.File;
import java.util.*;

public class FileInfo {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the File name:=");
    String name = sc.nextLine();
    File file =new File(name);
    if(file.exists()){
        System.out.println("Readable:"+file.canRead());
        System.out.println("Writeable:"+file.canWrite());
        if(file.isFile()){
            System.out.println("Type:File");
        }
        if(file.isDirectory()){
            System.out.println("Type:Dirctory");
        }
        System.out.println("Length:"+file.length()+" Bytes");

    }else{
        System.out.println("not found");
    }
    }
}
