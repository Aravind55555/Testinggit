package selenium1;

import java.util.Scanner;

public class flip {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
	System.out.println("Enter the Number:");
int k=s.nextInt();
int j=s.nextInt();
int mul=0;
for(int i=1;i<=j;i++){
	mul=mul+k;
}
System.out.println(mul);
	}
}
