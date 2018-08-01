import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number=371,temp,total=0;
		while(number!=0)
		{
			temp=number%10;
			total=total+temp*temp*temp;
			number=number/10;
		}
		if(total==number)
		{
			System.out.println("no");
		}
		else
		{
		System.out.println("yes");
		}
		}
		
}
