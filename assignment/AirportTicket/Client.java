import java.util.Scanner;
public class Client {
    public static void main(String args[]){

        //Assumption: We already have the client details.
        Scanner read = new Scanner(System.in);
        Dashboard display = new Dashboard();

        int option;
        System.out.println("Dashboard :");
        display.options();
        option=read.nextInt();
        display.selectedOption(option);


        read.close();



    }
}