public class MultiThreading extends Thread {

    public void run(){
        try { 
            int i = 1;
            while(i < 100){
                System.out.println("Running from thread");
                i++;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Thread can't run");
        }
    }

}