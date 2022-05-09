import java.util.Scanner;
	public class Watermelon{
		public static void main (String args [ ]){
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름을 입력하세요: ");
		int a = scan.nextInt();
		int pi = (double)3.14;
		System.out.println("수박의 넓이는: " + pi*a*a);
	}
}
//pi r의 제곱