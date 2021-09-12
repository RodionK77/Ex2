
public class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public char getGender(){
        return this.gender;
    }

    public String ToString(){
        return name + " " + gender + " at " + email;
    }
}