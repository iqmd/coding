public class Baggage {
    private boolean bags = true;


    public void checkBaggage(){
        if(bags == true){
            recieveBags();
        }else{
            System.out.println("No Baggage");
        }
    }

    public void recieveBags(){
        System.out.println("Bags recieved and here's your receipt");
    }
}
