public class Main {

    public static void main(String[] args) {
        Deserialize dsrz = new Deserialize();

        dsrz.deserialize("saved.data");
        
        Data newdata = dsrz.getData();

        System.out.println(newdata.email);
        System.out.println(newdata.name);
    }
    
}
