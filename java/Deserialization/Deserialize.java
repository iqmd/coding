import java.io.*;
public class Deserialize {
    Data obj;

    void deserialize(String filename){
        try {
            FileInputStream file =  new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            obj = (Data)in.readObject();
            in.close();
            file.close();
            System.out.println("Deserialization done !");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Can't deserialize");
        }
    }

    Data getData(){
        return obj;
    }

}
