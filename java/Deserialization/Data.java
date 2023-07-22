import java.io.Serializable;


public class Data implements Serializable {
    String name;
    String email;

    Data(String name, String email){
        this.name = name;
        this.email = email;
    }
} 