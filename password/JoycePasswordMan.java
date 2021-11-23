import java.util.ArrayList;
import java.util.Scanner;
public class PasswordMan {

    //Main method class to take in username and password and check if they are correct
    public static void main(String[] args){
        int tries = 3;
        String Username = "Joctt";
        String Password = "P@t13nce";
        ui Scanner = new Scanner(System.in);
        while(tries != 0){
            System.out.println("Please enter a username: ");
            String user = ui.nextString;
            System.out.println("Please enter a password: ");
            String pass = ui.nextString;
            if(user!=Username || pass!=Password){
                tries-=1;
                System.out.print("You have "+tries+" remaining!");
            }
            else{
                System.out.println("Welcome in Joctt!");
                menu();
        
            }    
        }    
    }   
    private static String menu(){
        System.out.println("Where would you like to go? Your options are password genarator(g), add account(a), password editor(e), catergory list(c), or quit(q) ");
                String input = ui.nextString;
                if(input=="g"){
                    PasswordGen();
                }
                else if(input=="q"){
                    Runtime runtime = Runtime.getRuntime();
                    //Process proc = runtime.exec("shutdown -s -t 0");
                    System.exit(0);
                }
                else if(input=="a"){
                    ScottPasswordMan.addAccount();
                }
                else if(input=="e"){
                    passwordEditor();
                }
                else if(input=="c"){
                    System.out.println("Which catergory would you like to find? ");
                    String cat = ui.nextLine();
                    int i=0;
                    while(i<passwordList.length){
                        if(passwordList[i].getCatergory().equals(cat)){
                            System.out.println(passwordList[i].getAccount());
                        }
                    }
                }
                else{
                    menu();
                }

            }

    //Password strength checker, checks the requirements of any made password
    private static void checker(){
        passwordList.add(ScottPasswordMan.addAccount());
        if(input.equals("a")){
            System.out.println("Enter an password(must have a capital letter, number, a special chacter and be 8 characters long): ");
            input = in.nextLine();
            System.out.println("Enter position: ");
            pos = in.nextInt();
            String specialCharcters = "!@#$%^&*";
            boolean[] reqCheckList= {false,false,false,false};
            // checks the password if it makes the requirements
            for (int i=0; i<input.length();i++){
                char letter=input.charAt(i);
            // checks the length of the password
                if (input.length()>=8){
                    reqCheckList[0]=true;
                }
                //checks for an uppercase letter
                if (Character.isUpperCase(letter)){
                    reqCheckList[1]=true;
                }
                //checks for a number
                if (Character.isDigit(letter)){
                    reqCheckList[2]=true;
                }
                //checks for a sepcial character
                if (specialCharcters.indexOf(input.substring(i,i+1))!=-1){
                    reqCheckList[3]=true;
                }
            }
                //check to see if the requirements are met
                if(reqCheckList[0]!=true||reqCheckList[1]!=true||reqCheckList[2]!=true||reqCheckList[3]!=true){
                    System.out.print("Sorry, doesn't meet the requirments");
                }
                else{
                    // if the requirements are met, then it will add the password to the list
                    passwordList.add(input);
                    if(pos>0 && pos<passwordList.size()){
                    passwordList.add(pos-1,input);
                } 
                }
                }
        }
    
    //Password editor(can delete, edit, change, or add passwords)
    private static void passwordEditor(){
        passwordList.add(ScottPasswordMan.addAccount());
        ArrayList <String> passwordList = new ArrayList<String>();
        passwordList.add("Cattac3!");
        passwordList.add("Doggod2@");
        passwordList.add("Snakeekans1#");

        Scanner in = new Scanner(System.in);
        String input = "";
        int pos;
    
        while(!input.equals("q")){
            System.out.println(passwordList);
            System.out.println("Would you like to (a)add, (m)oddify, (i)nsert, (r)emove, (c)lear, or (q)uit? ");
            input = in.nextLine();
            //adds a password to the list

            //removes a passowrd from the list
            if(input.equals("r")){
                System.out.println("Enter a password: ");
                input = in.nextLine();
                passwordList.remove(input);
            }
            //modifies a password
            else if(input.equals("m")){
                System.out.println("Enter a password to replace the one in the list: ");
                input = in.nextLine();
                System.out.println("Enter position of the old password to change it: ");
                pos = in.nextInt();
                //set(posistion, item) && remove(position, old item)
                if(pos>0 && pos<passwordList.size()){
                    passwordList.remove(pos);
                    passwordList.set(pos-1,input);
                }
            }
            //clears the list
            else if(input.equals("c")){
                System.out.println("Are you sure?: ");
                pos = in.nextInt();
                if(input.equals("yes")){
                    passwordList.clear();
                }
            }
            //quits the program
            else if(input.equals("q")){
                System.out.println("Are you sure?: ");
                pos = in.nextInt();
                if(input.equals("yes")){
                    break;
                }
            }
        }
    }

    //BONUS (optional if everything is done) Encryption
    //BONUS (optional if everything is done) Brute Strength
    //BONUS (optional if everything is done) Save to a database
}