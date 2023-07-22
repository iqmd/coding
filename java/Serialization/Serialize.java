import java.io.*;
public class Serialize {
    Data obj;

    Serialize(Data obj){
        this.obj = obj;
    }

    public void serialize(String filename) {
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(obj);

            System.out.println("Serialization Successful");

            out.close();
            file.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Can't Serialize");
        }
        
    }
}
