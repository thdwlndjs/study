package CH19;

public class CH196 {

	public static void main(String[] args) {
		Runnable blue = ()->{
			while(true) {
				System.out.println("청기올려");
			}
		};
		Runnable white = ()->{
			while(true) {
				System.out.println("백기올려");
			}
		};
		Thread blueFlag = new Thread(blue);
		Thread whiteFlag = new Thread(white);
		blueFlag.start();
		whiteFlag.start();
	}
}
