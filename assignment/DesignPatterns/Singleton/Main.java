public class Main{
    public static void main(String args[]){
        Singleton o1 = Singleton.getInstance();
        Singleton o2 = Singleton.getInstance();
        Singleton o3 = Singleton.getInstance();
        Singleton o4 = Singleton.getInstance();

        System.out.println(o1.age);
        System.out.println(o2.age);
        o3.age = 90;
        System.out.println(o4.age);
    }
}
