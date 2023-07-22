public class Main {
    public static void main(String[] args) {

        MultiThreading thr = new MultiThreading();

         thr.start();
        
        int i = 1;
        while(i < 100){
            System.out.println("Running from Main");
            i++;
        }
       

        
    }
}
