package Multithreading;

public class JoinMethod extends Thread {
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
        JoinMethod st = new JoinMethod();
        JoinMethod st1 = new JoinMethod();
        JoinMethod st2 =new JoinMethod();
        st.start();
        try{
            st.join();//
        }
        catch(Exception e) {
            System.out.println(e);
        }
        st1.start();
        st2.start();
    }
}











