package myJava15;
class CTest02 extends Thread
{
   private String id;
   public CTest02(String str){
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
public class Class02{
   public static void main(String args[]){
      CTest02 hi=new CTest02("Hello");
      CTest02 bye=new CTest02("Good bye");
      hi.run();
      bye.run();
   }
}