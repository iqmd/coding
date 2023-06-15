import java.util.Scanner;
public class ClientUtil {
    public static String takeInput(){
        String menu;
        System.out.println("Which menu do you want to see ?");
        Scanner read = new Scanner(System.in);
        menu = read.nextLine();
        return menu;

    }
}
