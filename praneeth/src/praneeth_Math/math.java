package praneeth_Math;

public class math {
	public static long pow(int b,int e)
	{
		if(e==0)
			return 1;
		long half=pow(b,e/2);
		if(e%2==0)
			return (long)(half*half);
		return (long)(half*half*b);
	}
}
