public class pqrNetwork implements Network {
    private double rate = 4;

    public double price(int mins){
        return mins*rate;
    }

    public double getRate(){
        return rate;
    }

    public void getPlan(){
        System.out.println("Our Rate is:"+getRate());
    }
}
