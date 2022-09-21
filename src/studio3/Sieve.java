package studio3;
	import java. util. ArrayList;
	import java.util.List;
	import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Put the number: ");
		int x = in.nextInt();
		int [] priArray = new int [x+1];
		for(int i=2; i<x;i++)
		{
			if(priArray [i] == 0)
			{
			System.out.print(i+" ");
			for (int j=2;j<=x/i;j++)
			{
				priArray[i*j]=1;
			}
			}
		}
		
		
		
		
		/*Scanner in = new Scanner(System.in);
		System.out.print("Put the number: ");
		int x = in.nextInt();
		boolean flag;
		List<Integer> priArr = new ArrayList<>();
		for(int i=2; i<x;i++)
		{
			flag=true;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				priArr.add(i);
			}
		}
			for(int s:priArr)
			{
				System.out.print(s+" ");
			}*/
		}



	}

