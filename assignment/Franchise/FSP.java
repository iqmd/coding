public class FSP { // Franchise Service Provider
    private KFC kfc;
    private Dominos domino;
    private McDonalds mcd;

    public double buyKFCFranchise(){
        kfc = new KFC();

        //Calculates total cost with additional tax of 12%

        return (kfc.getCost()+kfc.getRegistration()) + (kfc.getCost()+kfc.getRegistration())*0.12;
    }

    public double buyDominosFranchise(){
        domino = new Dominos();
        //Calculates total cost with additional tax of 12%
        return (domino.getCost()+domino.getRegistration()) + (domino.getCost()+domino.getRegistration())*0.12;
    }

    public double buyMcDonaldsFranchise(){
        mcd = new McDonalds();
        //Calculates total cost with additional tax of 12%
        return (mcd.getCost()+mcd.getRegistration()) + (mcd.getCost()+mcd.getRegistration())*0.12;
    }

}
