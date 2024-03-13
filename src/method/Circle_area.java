package method;
import java.util.Scanner; 
public class Circle_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius: ");
		double r=sc.nextDouble();
		area(r);
		Sum_Num sm=new Sum_Num();
		sm.sum(5,6);
		Sum_Num.sum(7,9);
	}
	public static void area(double r) {
		double result=Math.PI*Math.pow(r, 2);
		System.out.println("Circle area: 3"+result);
	}

}
