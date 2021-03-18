import java.util.*;
public class append
{
	public static int[] appen(int a[],int n,int x)
	{
		int b[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		b[n]=x;
		return b;
	}
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8};
		a=appen(a,a.length,9);
		System.out.println(Arrays.toString(a));
	}
}