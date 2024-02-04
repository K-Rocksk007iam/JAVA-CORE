package assignment;

//reverse numbers

public class Question5 {

	public static void main(String[] args) {
		int num=23; int reverse=0;
		
		while(num!=0) {
		int remainder  = num%10;
		reverse= reverse * 10 +remainder;
		num /= 10;
		}
		
		System.out.println(reverse);

}
}