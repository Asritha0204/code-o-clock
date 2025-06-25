package Multithreading;
public class SimpleThread extends Thread {
    public void run() {
        for(int i=0;i<=10;i++) {
            try{
                Thread.sleep(1000);//1000 milliseconds = 1 second delay
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        SimpleThread st = new SimpleThread();
        SimpleThread st1 = new SimpleThread();
        st.start();
        st1.start();
    }
}
