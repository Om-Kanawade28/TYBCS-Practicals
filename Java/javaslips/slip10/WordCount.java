import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String args[]){
        try{
    FileReader file = new FileReader(args[0]);
    BufferedReader br = new BufferedReader(file);
    String line;
    int Count =0;
    String findw = args[1];
    while((line = br.readLine()) != null){
        String words[] = line.split("\\s+");
        for(int i=0;i<words.length;i++){
            if(words[i].equals(findw)){
                Count++;
            }
        }
        System.out.println(line);

    }
            System.out.println(Count);

}catch(Exception e){

}
    }
}
