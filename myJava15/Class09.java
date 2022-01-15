package myJava15;
class CTest09 extends Thread implements Runnable{
   private String id;
   private int sec;
   public CTest09(String str,int s){
      id=str;
      sec=s;
   }
   public void run(){
      for(int i=0;i<10;i++){
         try{
            sleep(sec);
         }
         catch(InterruptedException e){
        	 
         }
         System.out.println(id+" is running..");
      }
   }
}

public class Class09{
   public static void main(String args[]){
      CTest09 one=new CTest09("Thread 1",1000);
      CTest09 two=new CTest09("Thread 2",2500);
      Thread t1=new Thread(one);
      Thread t2=new Thread(two);
      t1.start();
      t2.start();
   }
}