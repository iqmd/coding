public abstract class PrintMe {
    //Factory class
    void print(){
       Electronics gadget = getGadget() ;
       gadget.print();
    }
    protected abstract Electronics getGadget();
}
