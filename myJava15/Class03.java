package myJava15;
class CTest03 extends Thread{
   private String id;
   public CTest03(String str){
      id=str;
   }
   public void run(){
      for(int i=1;i<=5;i++){
         for(int j=0;j<100000000;j++);{
        	 
         }
         System.out.println(id+" "+i);
      }
   }
}

public class Class03{
   public static void main(String args[]){
      CTest03 hi=new CTest03("Hello");
      CTest03 bye=new CTest03("Good bye");
      hi.start();
      bye.start();
   }
}