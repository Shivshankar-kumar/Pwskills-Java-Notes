
//Wap to give an example of by extending thread class
//we know that, thread can be implemented by two ways..
//(1) by Extending Thread class
//(2) By implementing Runnable interface 
import java.util.Scanner;
class myThread extends Thread{
    Scanner sc=new Scanner(System.in);
    public void run(){
        System.out.println("Task-1 has been started");
        System.out.println("Enter the first Number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second Number: ");
        int b=sc.nextInt();
        System.out.println("Rusult is= "+(a+b));
        System.out.println("Task-1 Has Been Ended");
    }
}
class thred2 extends Thread{
    public void run(){
        System.out.println("task-2 is started");
        System.out.println("Imported message");
        System.out.println("focus is important key");
        System.out.println("task-2 is stopped");
    }
}
public class extendingThread{
    public static void main(String[] args) {
        //Object
        myThread t1=new myThread();
        thred2 t2=new thred2();
        t1.start();
        t2.start();
    }
}