package homeTask_WithoutLambdaExpressions;

public class RunnableInterfaceToPrintNumbersLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Runnable r=()->{
	  
	  for(int i=0;i<10;i++)
	  {
		  System.out.println("new thread"+i);
	  }
  };
  Thread t= new Thread(r);
  t.start();
	

	for(int i=0;i<10;i++)
	{
		System.out.println("This is from main thread"+i);
	}
	}
}
