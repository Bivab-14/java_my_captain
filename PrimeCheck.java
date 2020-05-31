import java.util.Scanner;
class PrimeCheck
{
   public static void main(String args[])
   {		
	int temp;
	boolean isPrime=true;
        int num;
       try (Scanner scan = new Scanner(System.in)) {
           System.out.println("Enter any number:");
           num = scan.nextInt();
       }
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
        
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}
