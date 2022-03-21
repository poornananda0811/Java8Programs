package homeTask_Consumer_Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierToProduceRandomOTP {

	public static void main(String[] args) {
		Supplier<String> randomOtp= ()->{
			String otp="";
			for(int i=0;i<4;i++)
			{
				otp=otp+(int)(Math.random()*10);
			}
			
			return otp;
		};
System.out.println("The OTP is "+randomOtp.get());
	}

}
