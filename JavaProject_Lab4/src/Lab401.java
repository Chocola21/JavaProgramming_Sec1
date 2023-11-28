import java.util.Scanner;

public class Lab401 {

	public static void main(String[] args) {
		int x,y,total;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input valus of X : ");
		x = scan.nextInt();
		int sum = x;
		System.out.print("Input valus of V : ");
		y = scan.nextInt();
		while (y<x) {
		System.out.print("Input valus of V, again: ");
		 y = scan.nextInt();
		}
		System.out.println();
		while(x<y) {
			x++;
			total = sum+x;
			System.out.println(sum+" + "+x+" = "+total);
			sum=total;
		}
	}

}
