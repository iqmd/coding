public class Singleton {
    private static Singleton sc = null;
    public int age = 7;
    private Singleton(){}
    public static Singleton getInstance(){
        if(sc == null){
            sc = new Singleton();
        }
        return sc;
    }
}
