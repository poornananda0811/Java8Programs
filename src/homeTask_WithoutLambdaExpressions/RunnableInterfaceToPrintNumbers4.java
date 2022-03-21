

package homeTask_WithoutLambdaExpressions;

public class RunnableInterfaceToPrintNumbers4 implements Runnable 
{ 
  public void run() 
   { 
     try 
       { 
        for(int i=1;i<=10;i++) 
        { 
                
          System.out.println(i); 
        } 
        } 
       catch(Exception e) 
           { 
             System.out.println("Exception..."+e); 
           } 
    } 
  public static void main(String [] args) 
  { 
	  RunnableInterfaceToPrintNumbers4 m1 = new RunnableInterfaceToPrintNumbers4(); 
    Thread thread = new Thread(m1); 
    thread.start(); 
  } 
} 
 
