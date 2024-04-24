
//In multithreading we can not say sequence of output when you'll run again and again then get output different.

class thread1 extends Thread{
    @Override
    public void run(){
        try{
        for(int i=1; i<=10; i++){
            System.out.println("hi shiv");
            Thread.sleep(1000);
        }
    }
    catch(Exception e){
        System.out.println("some problem");
    }
}
}
public class multi {
    public static void main(String[] args) throws InterruptedException {
        thread1 t1=new thread1();
        t1.start();
        for(int i=1; i<=10; i++){
            System.out.println("kaise hain aaplog");
            Thread.sleep(1000);
        }
    }
}
