package CH19;
/*
 * 멀티스레드가 실행될때 여러스레드가 하나의 데이터를 공유해서 충돌이 발생함->스레드 동기화
 * 동기화하는 키워드	:synchronized
 * 동기화하는 방법	:메서드동기화, 블록동기화
 * 	메서드동기화	:public synchronized void add()
 */

class Bank {// 두 스레드가 서로의 작업에 간섭하기 때문에 정상적인 값이 나오지 않는다.
	private int money;

	public int getMoney() {
		return money;
	}

	public void addMoney(int money) {
		this.money += money;
	}
}

class AddThread implements Runnable {
	private Bank b;
	private String name;

	public AddThread(String name, Bank b) {
		this.name = name;
		this.b = b;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				b.addMoney(1000);
				System.out.println(this.name + "현재잔고" + b.getMoney());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class CH197 {
	public static void main(String[] args) {
		Bank b = new Bank();
		Thread th1 = new Thread(new AddThread("1번", b));
		Thread th2 = new Thread(new AddThread("2번", b));
		th1.start();
		th2.start();

	}
}
