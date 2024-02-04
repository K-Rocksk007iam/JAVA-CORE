package assignment;

public class Question6 {

	public static void main(String[] args) {
int num=23; int count=0;
		
		while(num!=0) {
		int remainder  = num%10;
		count= count+remainder;
		num /= 10;
		}
		System.out.println(count);
	}
	

}
