package multithreading;

class ThreadDemo3 extends Thread {
	public void run() {
		System.out.println("RUN METHOD ");
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();

		System.out.println("ID :" + id);
		System.out.println("NAME :" + name);
	}
}

public class MultiThreadingDemo2 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			ThreadDemo3 obj = new ThreadDemo3();
			obj.start();
			System.out.println("-------------------");
		}

	}

}
