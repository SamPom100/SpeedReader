import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Reader {
    private ArrayList<String> storage = new ArrayList<String>();
    public ArrayList<String> readText()
    {
        BufferedReader br = null;
        String contentLine;
        String fullText = "";
        try
        { 
            br = new BufferedReader(new FileReader("C://text.txt"));   
            contentLine = br.readLine();
            while (contentLine != null)
            { 
                processor(contentLine);
                contentLine = br.readLine();                 
            } 
        } 
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        } 
        return storage; 
    }

    public void processor(String in)
    {
        String s = in;
        String[] arr = s.split(" ");       
        for (String ss : arr)
        {
            storage.add(ss);
        }
    }
    
    public ArrayList<String> getStorage(){return storage;}
} 