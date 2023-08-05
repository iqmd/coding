import java.util.Scanner;
public class Client {
    public static void main(String[] args) {

        FSP serviceFsp = new FSP();
        String franchise;
        Scanner read = new Scanner(System.in);

        System.out.println("Which Franchise do you want to buy ?");

        franchise = read.nextLine();
        read.close();

        if(franchise.equalsIgnoreCase("KFC")){

            System.out.printf("Total Cost Inclusive of all taxes : Rs  %.0f  \n",serviceFsp.buyKFCFranchise());

        }else if(franchise.equalsIgnoreCase("Dominos")){

            System.out.printf("Total Cost Inclusive of all taxes : Rs %.0f  \n",serviceFsp.buyDominosFranchise());

        }else if(franchise.equalsIgnoreCase("McDonalds")){

             System.out.printf("Total Cost Inclusive of all taxes : Rs %.0f \n",serviceFsp.buyMcDonaldsFranchise());
        }


    }
}
