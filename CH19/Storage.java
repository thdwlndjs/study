package CH19;

public class Storage {
	private int StackCount = 10;

	public synchronized void addStack(int StackCount) {
		this.StackCount += StackCount;
		if (this.StackCount >= 10) {
			System.out.println("스레드깨우기");
			notify();
		}
	}

	public synchronized void popStack(int leaveCount) {
		try {
			if(leaveCount>this.StackCount) {
				this.StackCount=0;
			}
			else {
				this.StackCount-=leaveCount;
			}
			if(this.StackCount==0) {
				System.out.println("짐없음대기");
				wait();
				System.out.println("짐없음완료");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int getStackCount() {
		return this.StackCount;
	}
}
