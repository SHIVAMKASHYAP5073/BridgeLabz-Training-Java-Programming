package Streams.Multithreading;

public class MyThread1 extends Thread {
    @Override
    public void run(){

        try{
        for(int i=0;i<=5;i++){
            System.out.println(i);

            Thread.sleep(2000);
        }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
class Main2{
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        t1.start();

        
    }
}
