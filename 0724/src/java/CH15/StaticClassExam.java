package CH15;

//PrintOut 외부 클래스
class PrintOut{
	
	//정적 내부 클래스 
	public static class Out{
		
		//메서드 
		public void println(String str)
		{
			System.out.println(str);
		}
	}
	
}
public class StaticClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "정적 내부 클래스 테스트";
		//여기 작성
		//정적 내부 클래스 선언하는 방법
		//외부클래스 이름.내부클래스 이름   참조변수 = new 외부클래스이름.내부클래스();
		PrintOut.Out out = new PrintOut.Out();
		//실행결과 정적 내부 클래스 테스트
		out.println(str);
	}

}
