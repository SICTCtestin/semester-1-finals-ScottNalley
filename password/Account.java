public class Account {
    String title;
    String username;
    String password;
    String catergory;

    public Account(){
        title = " ";
        username = " ";
        password = " ";
        catergory = " ";
    }

    public Account(String a, String b, String c, String d){
        this.title = a;
        this.username = b;
        this.password = c;
        this.catergory = d;
    }
    public void setTitle(String e){
        this.title = e;
    }
    public void setUsername(String f){
        this.username = f;
    }
    public void setPassword(String g){
        this.password = g;
    }
    public void setCatergory(String h){
        this.catergory = h;
    }
    public String getTitle(){
        return title;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getCatergory(){
        return catergory;
    }

}
