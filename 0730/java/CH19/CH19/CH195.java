package CH19;

/*
 * public interface Runnable 상속
 * MyThread th = new Thread(Runnable을 상속한 인스턴스);
 * th는 참조변수
 * Thread가 실행하는 주체, Runnable 상속한 클래스는 실행코드를 지닌 객체
 */
/*
 * Thread에 이름 부여하기
 * Thread-n
 * Thread클래스의 setName메서드를 이용해 변경
 * public class Mytask extends Thread{
 * publis Mytask(){
 * setName("MyTask-1")
 * }
 * }
 * getName()은 반환
 * Runnable task = ()->{
 * };
 * Thread myThread = new Thread(task);
 * myThread.setName("");
 */
/*멀티스레드
 * 비동기작업은 같은시간에 서로다른 독립적인 스레드가 일을 처리하는 것
 */
class WhiteFlag implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("백기올려");
		}
	}

}

public class CH195 {
	public static void main(String[] args) {
		Thread write = new Thread(new WhiteFlag());
		write.start();
	}
}
