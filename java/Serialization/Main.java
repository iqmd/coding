public class Main {

    public static void main(String[] args) {
        Data details = new Data("Iqbal", "me@gmail.com");
        Serialize srz = new Serialize(details);

        srz.serialize("saved.data");
    }
    
}
