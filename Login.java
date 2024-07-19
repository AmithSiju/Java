import java.util.*;

class nameexception extends RuntimeException{
    nameexception(String s){
    super(s);
    }
}
class passexception extends RuntimeException{
    passexception(String s){
    super(s);
    }
}
class user{
    String name,pass;
    user(String n, String p){
        name=n;
        pass=p;
    }
    void login(String n,String p){
        if(name.equals(n)&&pass.equals(p)){
            System.out.println("Login Successful!!!");
        }else{
            throw new passexception("Invalid username or password ");       
        }
    }
}


public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a username :");
        String n = sc.next();
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if ((ch>=65&&ch<=90)||(ch>=97&&ch<=122)) {
                continue;
            }else{
                throw new nameexception("Invalid username");
            }
        }
        System.out.println("Enter password : ");
        int f=0;
        String p = sc.next();
        if(p.length()<8)
        throw new nameexception("Password must have 8 charachters");
        for (int j = 0; j < p.length(); j++) {
            char ch = p.charAt(j);
            if (ch>=48 && ch<= 57) {
                f=1;
            }
        }
        if(f==0){
            throw new passexception("password must contain atleast one number");
        }
        user u1 = new user(n, p);
        System.out.println("Username : ");
        String name = sc.next();
        System.out.println("Password : ");
        String pass = sc.next();
        u1.login(name, pass);
    }
}