package FromFirst;

public class MathOperations {
	public int Biggest(int a,int b,int c)
	{
		int big = a>b?a:b>c?b:c;
		return big;
	}
	public int Reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}
	public boolean isPalindrome(int num)
	{
		return num==Reverse(num);
	}
	public boolean isPrime(int num)
	{
		int count=0;
		if(num<2)
		{
			return false;
		}
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
					return false;
			}
		}
		return true;
	}
	public int countPrimes(int lb,int ub)
	{
		int count=0;
		for(int i=lb;i<=ub;i++)
		{
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
		
	}

}
