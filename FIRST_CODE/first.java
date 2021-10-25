import java.util.Scanner;
public class first
{


	public static void main(String[] args)
	{
		int a,b,c;
		Scanner scan = new Scanner (System.in);
		System.out.println("a :");
		a=scan.nextInt();
		System.out.println("b :");
		b=scan.nextInt();
		System.out.println("c :");
		c=scan.nextInt();
		int d=a+b+c;
		System.out.println(a+"+ "+b+"+ "+c+"= "+d);


	}
}