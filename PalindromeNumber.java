import java.util.Scanner;

class PalindromeNumber{
	public static void main(String[] args){
		int rev =0;
		int num;
		int comp;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any num: ");
		num = sc.nextInt();
		comp=num;
		while(num > 0){
			rev = rev * 10 + num % 10;
			num=num/10;
		
		}
	if(rev==comp){
		System.out.println("Palindrome");
	}
	
		else{
		System.out.println("Not Palindrome");
		}
	}
}