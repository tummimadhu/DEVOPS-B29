package calcpkg;


public class MyCalc {
	
	public int sum(int a, int b)
	{
		return a+b;

	}


	public int diff(int a, int b)
	{
		return a-b;

	}
	
	public int mul(int a, int b)
	{
		return a*b;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc pb = new MyCalc();
		System.out.println("Sum is: " +pb.sum(20, 10));
		System.out.println("Diff is: " +pb.diff(20, 10));
		System.out.println("Mul is: " +pb.mul(20, 10));

	}

}
