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
		//블록동기화:스레드의 간섭을 막기 위해
		//전체메서드가 아닌 특정 영역만 동기화
//		순서
//		1.스레드1이 블록진입
//		스레드1:synchronized (b)블록에 들어가서 잠금획득
//		b.addMoney(1000)호출 및 잔고 출력
//		블록을 벗어나면 잠극해제
//		2.스레드 2가 대기
//		synchronized (b)블록에 들어가려 하지만, 스레드 1이 잠금을 보뷰하고 있어 대기
//		3.스레드1실행완료후스레드2가 블록에진입
//		스레드2:synchronized (b)블록에 들어가서 잠금획득
//		b.addMoney(1000) 호출 및 잔고출력
//		블록을 벗어나면 잠금해제
		synchronized (b) {
			try {
				for (int i = 0; i < 10; i++) {
//					sleep(int mils)메서드는 주어진 시간동안 스레드를 정지시키는 메서드
//					작업속도제어할때사용
					Thread.sleep(1000);
					b.addMoney(1000);
					System.out.println(this.name + "현재잔고" + b.getMoney());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
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
