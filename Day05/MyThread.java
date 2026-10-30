package Day05 ;
public class MyThread {
    public static void main(String[] args){
        System.out.println(Thread.currentThread());
        Thread t1 = new mine();
        Thread t = new Thread(t1);
        t.start();
        t.setName("mythread");
        String name = t.getName();
        System.out.println(name);
    }
}

class mine extends Thread{
    public void run(){
        System.out.println("Thread is running.");
    }
}