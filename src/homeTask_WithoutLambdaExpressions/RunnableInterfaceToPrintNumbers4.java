package homeTask_WithoutLambdaExpressions;

class MyRunnable implements Runnable
{

@Override
public void run()
	    {
	 	   for(int i=0;i<10;i++)
	 	   {
	 		   System.out.println("New Thread"+i);
	 	   }
	    }		
}

public class RunnableInterfaceToPrintNumbers4 
{ 
	
 	public static void main(String args[])
	{
 		MyRunnable r = new MyRunnable();
 		Thread t= new Thread(r);
	       t.start();        
	       for(int i=0;i<10;i++)
	   	{
	   		System.out.println("This is from main thread"+i);
	   	}				
	}
	
} 