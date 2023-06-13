public class ElectronicFactory{
    public Electronics getGadget(String gadget){
        if(gadget == "TV"){
            return new TV();
        }else if(gadget == "Laptop"){
            return new Laptop();
        }else if(gadget == "Mobile"){
            return new Mobile();
        }
        return null;
    }
}
    
    
    
        
