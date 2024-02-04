package multithreading;

class PrintEvenOdd extends Thread {
	static boolean flag = true;

	public synchronized void printEven() {
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);
		}
	}

	public synchronized void printOdd() {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
	}

	public void run() {
		if (flag == true) {
			flag = false;
			System.out.println("-------EVEN--------");
			printEven();

		} else {
			System.out.println("-------ODD-------");
			printOdd();
		}
	}

}

public class SynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		PrintEvenOdd obj = new PrintEvenOdd();
		System.out.println("FOR FIRST THREAD");
		obj.start();
		obj.sleep(1000);
		PrintEvenOdd obj1 = new PrintEvenOdd();
		System.out.println("\nFOR SECOND THREAD");
		obj1.start();
	}

}
