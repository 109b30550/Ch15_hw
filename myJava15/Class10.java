package myJava15;
class CTest10 implements Runnable{
   private String id;
   public CTest10(String str){
      id=str;
   }
   public void run(){
      for(int i=1;i<=5;i++){
         try{
            Thread.sleep((int)(2000*Math.random()));
         }
         catch(InterruptedException e){
        	 
         }
         System.out.println(id+" "+i);
      }
   }
}
public class Class10{
   public static void main(String args[]){
      CTest10 hi=new CTest10("Hello");
      CTest10 bye=new CTest10("Good bye");
      CTest10 morning=new CTest10("Good morning");
      CTest10 night=new CTest10("Good night");
      Thread t1=new Thread(hi);
      Thread t2=new Thread(bye);
      Thread t3=new Thread(morning);
      Thread t4=new Thread(night);
      t1.start();
      t2.start();
      t3.start();
      t4.start();
   }
}