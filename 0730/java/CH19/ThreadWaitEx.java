package CH19;

class AddstackThread extends Thread{
	private Storage storage;
	public AddstackThread(Storage storage) {
		this.storage=storage;
	}
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				if(this.storage.getStackCount()==0) {
					System.out.println("짐추가");
					this.storage.addStack(10);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class PopstackThread extends Thread{
	private Storage storage;

	public PopstackThread(Storage storage) {
		this.storage=storage;
	}

	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("짐5개나르기");
				this.storage.popStack(5);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadWaitEx {
	public static void main(String[] args) {
		Storage s = new Storage();
		AddstackThread add = new AddstackThread(s);
		PopstackThread pop = new PopstackThread(s);
		add.start();
		pop.start();
	}

}
//wait 스레드대기
//notify()대기중인 스레드를 다시 동작