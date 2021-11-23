import java.util.Scanner;
import java.io.*;

public class PasswordMan {

    private static final String DATA_FILE = "mypasswords.txt";
    //Main method class to take in username and password and check if they are correct
    private static void main(args[] strings){

    }

    //Password editor(can delete, edit, change, or add passwords)
    public static Account addAccount(){
        Scanner ui = new Scanner(System.in);
        //ask for title
        System.out.println("What is the title of the account? ");
        String title = ui.nextString;
        //askfor un
        System.out.println("What is the username of the account? ");
        String username = ui.nextString;
        //ask for pw
        System.out.println("What is the password of the account? ");
        String password = ui.nextString;
        JoycePasswordMan.checker();
        //ask for category
        System.out.println("What is the catergory you want the account to be in? ");
        String catergory = ui.nextString;
        Account a = new Account(title,username,password,catergory);
        return a;
    }


    //Password library to store previous passwords and catergories
    public static void saver(String[] args){
        //class we built. function we built
        passwordWriter.writeString("Hello world");
        passwordWriter.saveAndClose();
        System.out.println(passwordWriter.readString());
    }


}
