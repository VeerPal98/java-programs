import java.util.Scanner;

class UseScanner{
	public static void main(String args[]) {
		
		int num;
		int rev = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Numbers);
		num = sc.nextInt();
		
		while(num != 0) {
			rev = rev * 10 + num % 10;
			
			num = num/10;
	
		}
		System.out.println(rev);
		}
}