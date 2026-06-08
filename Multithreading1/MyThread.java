package Streams.Multithreading;


public class MyThread extends Thread {
   @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("child class: "+ i);

        }
    }
    
}
class Main1{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();

        for(int i=0;i<=5;i++){
            System.out.println("Main class: "+ i);
        }
    }
}
