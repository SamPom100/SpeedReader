import java.util.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
public class Display
{
    private static Frame f = new Frame();
    public static void main()
    {
        Reader r = new Reader(); Toggle t = new Toggle(); ArrayList<String> storage = r.readText(); f.main();
        while(true){try{TimeUnit.MILLISECONDS.sleep(1);}catch(Exception e){}
            if(t.getToggle()){
                if(t.isCustom()){storage.clear();r.processor(t.getString());storage = r.getStorage();}
                for(int i = 0; i<storage.size(); i++){
                    try{TimeUnit.MILLISECONDS.sleep(t.getSpeed());}catch(Exception e){}
                    String one = "";String two = "";String three = "";
                    if(storage.get(i).length()==1){two = storage.get(i);}
                    if(storage.get(i).length() >= 2 && storage.get(i).length() <= 5){one = storage.get(i).substring(0,1);two = storage.get(i).substring(1,2);three = storage.get(i).substring(2);}
                    if(storage.get(i).length() >= 6 && storage.get(i).length() <= 9){one = storage.get(i).substring(0,2);two = storage.get(i).substring(2,3);three = storage.get(i).substring(3);}
                    if(storage.get(i).length() >= 10 && storage.get(i).length() <= 13){one = storage.get(i).substring(0,3);two = storage.get(i).substring(3,4);three = storage.get(i).substring(4);}
                    if(storage.get(i).length() >= 14){one = storage.get(i).substring(0,4);two = storage.get(i).substring(4,5);three = storage.get(i).substring(5);}               
                    try{f.label.setText("<html>"+one+"<font color='red'>"+two+"</font>"+three+"</html>");}
                    catch(Exception e){f.label.setText(storage.get(i));}if(i==storage.size()-1){try{TimeUnit.SECONDS.sleep(2);}catch(Exception e){}System.exit(0);}}}}}
}
class Toggle
{
    private static boolean toggle; private static int speed; private static boolean custom;private static String customText = "";
    public Toggle(){toggle = false;custom=false;}
    public boolean getToggle(){return toggle;}
    public int getSpeed(){return speed;}  
    public void setTrue(){toggle = true;}   
    public void setSpeed(int in){speed = in;}
    public void setCustom(){custom = true;}
    public boolean isCustom(){return custom;}
    public void setString(String in){customText = in;}
    public String getString(){return customText;}
}
