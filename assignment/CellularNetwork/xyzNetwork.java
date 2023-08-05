public class xyzNetwork implements Network {
    private double rate = 1.25;

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
