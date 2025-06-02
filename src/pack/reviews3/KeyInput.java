package pack.reviews3;
import java.io.*;
public class KeyInput {
    public String readString(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputstr = "";
        try {
            inputstr = br.readLine();
        } catch (IOException e){
            System.out.println("ERROR: IOException");
        }
        return inputstr;
    }
}
