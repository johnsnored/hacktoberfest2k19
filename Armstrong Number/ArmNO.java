import java.util.*;
class ArmNO
{  
      void main() 
	 {  
	        int c=0,a,temp,n;  
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		n=sc.nextInt();
	        temp=n;  
	        while(n>0)  
	        {  
		        a=n%10; n=n/10;  
        		c+=(a*a*a);  
	        }  
	        if(temp==c)  
		        System.out.println(temp+" is an armstrong number");   
	        else  
        	   	System.out.println("Not armstrong number");   
       }  
}  
