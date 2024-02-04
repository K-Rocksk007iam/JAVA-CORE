package multithreading;

import java.lang.Thread;

class ThreadDemo1 extends Thread {

	public void fun3() {
		System.out.println("this is fun3");
	}

	public void fun4() {
		System.out.println("this is fun4");
	}

	public void run() { // overriding the method of thread class
		System.out.println("RUN METHOD ThreadDemo1");
		fun3();
		fun4();
		System.out.println("---------------------------------------");
	}

}

class ThreadDemo extends Thread {

	public void fun1() {
		System.out.println("this is fun1");
	}

	public void fun2() {
		System.out.println("this is fun2");
	}

	public void run() { // overriding the method of thread class
		System.out.println("RUN METHOD ThreadDemo");
		fun1();
		fun2();
		System.out.println("---------------------------------------");
	}
}

public class MultithreadingDemo {

	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		obj.start();

		ThreadDemo1 obj1 = new ThreadDemo1();
		obj1.start();
	}

}
