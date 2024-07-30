package CH19;

/*프로세스
 * 스레드: 프로세스 내에서 독립적으로 실행되는 작업단위를 의미
 * 사용방법
 * 1.Thread클래스를 상속해 run()메서드 구현
 * Runnable 인터페이스 구현
 * Runnable 인터페이스는 몸체가 없는 메서드인 run() 하나만을 가지는 인터페이스
String threadName=Thread.currentThread().getName();
System.out.println("현재 쓰레드: "+threadName);
 */

class MyThread extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + (i + 1);
		}
		System.out.println("sum=" + sum);
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 쓰레드: " + threadName);
	}
}

public class CH194 {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
	}
}
