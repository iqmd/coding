import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //getting input
        int minutes = Integer.parseInt(read.nextLine());
        String network = read.nextLine();
        read.close();

        NetworkFactory networks = new NetworkFactory();

        Network cellNetwork = networks.createNetwork(network);

        System.out.println(cellNetwork.price(minutes));
    }
}