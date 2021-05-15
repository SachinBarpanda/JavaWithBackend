import java.util.*;

class NewTopic{
	public static void main(String args[]){
		System.out.println("Hi here we will see how to use a radix program");
		Scanner sc = new Scanner(System.in);
		sc.useRadix(3);
		int x = sc.nextInt();
		System.out.println(x );
	}
}