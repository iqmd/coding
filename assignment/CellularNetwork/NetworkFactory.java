public class NetworkFactory {
    
    public Network createNetwork(String networkCompany){
        if(networkCompany.equals("abc")){
            return new abcNetwork();
        }else if(networkCompany.equals("pqr")){
            return new pqrNetwork();
        }else{
            return new xyzNetwork();
        }

    }
}
