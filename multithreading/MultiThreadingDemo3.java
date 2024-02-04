package multithreading;

class ThreadDemo4 implements Runnable {

	public void run() {
		System.out.println("this is second method for \ncreating the thread using runnable");
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();

		System.out.println("ID :" + id);
		System.out.println("NAME :" + name);
	}
}

public class MultiThreadingDemo3 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			//FIRST METHOD
			ThreadDemo4 obj = new ThreadDemo4();
			Thread th = new Thread(obj);
			th.start();

			//SECOND METHOD
			System.out.println("-------------------");
			Thread th1 = new Thread(new ThreadDemo4());
			th1.start();
		}

	}

}
