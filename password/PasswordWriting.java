import java.util.Scanner;
import java.io.passwordWriter;
import java.io.FileWriter;
import java.io.File;

public class PasswordWriting {
    
    //global variables to help out
    private static final String DATA_FILE = "mypasswords.txt";
    private static Scanner in;
    private static passwordWriter out;

    //readString
    public static void writeString(String s){
        //check to see if out is already created or not
        if(out==null){
            try{
                out = new passwordWriter(new FileWriter(DATA_FILE));
            }
            catch(Exception e){
                System.err.println("Cannot open file for output!");
                e.printStackTrace();
            }
        }
    try{
        out.write(s);
        out.newLine();
    }
    catch(Exception e){
        System.err.println("Cannot write file!");
        e.printStackTrace();
    }
    }

    //saveAndClose
    public static void saveAndClose(){
        //closes after the Scanner is done reading the file
        if(in!=null){
            try{
                in.close();
                in = null;
            }
            catch(Exception e){
                System.err.println("Cannot close input file!");
                e.printStackTrace();
            }
        }
        //closes after the BufferedWriter is done writing to the file
        if(out!=null){
            try{
                out.close();
                out = null;
            }
            catch(Exception e){
                System.err.println("Cannot close output file!");
                e.printStackTrace();
            }
        }
    }
    //readString
    public static String readString(){
        //check to see if you are already reading
        if(in == null){
            try{
                in = new Scanner(new File(DATA_FILE));
        }
        catch(Exception e){
            System.err.println("Cannot open file for input!");
            e.printStackTrace();
        }
    }
    //read in the values from the text file
    try{
        //check to see if in hasNext line
        if(in.hasNext()){
            String s = in.nextLine();
            return s; //grabbing EVERYTHING
        }
        else{
            return null;
        }
    }
    catch(Exception e){
        System.err.println("Cannot open file for input!");
        e.printStackTrace();
    }
    return null;
    }
}
