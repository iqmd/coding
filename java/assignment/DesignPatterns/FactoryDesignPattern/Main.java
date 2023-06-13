public class Main{
    public static void main(String args[]){
       ElectronicFactory gadget = new ElectronicFactory(); 
       Electronics tv = gadget.getGadget("TV");
       Electronics mobile = gadget.getGadget("Mobile");

       Electronics Laptop = gadget.getGadget("Laptop");
       tv.print();
       mobile.print();
    }
}
