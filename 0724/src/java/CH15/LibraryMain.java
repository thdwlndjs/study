package CH15;

//외부 클래스
class Library{

	private String name;
	
	public Library(String name)
	{
		this.name = name;
	}
	
	//모든 자바 클래슨 ㄴ기본적으로 'Object' 클래스를 상속 받고 있다.
	//'toString' 오버라이드 
	// 객체 정보를 문자열로 반환하는 용도
	// 이 클래스의 객체를 문자열로 표현할 때 사용
	@Override
	public String toString()
	{
		return "도서관 이름 : " +name;
	}
	
	//정적 내부 클래스
	public static class Book{
		private String title;
		
		//생성자
		public Book(String title)
		{
			this.title = title;
		}
		
		//책 정보 출력 메서드
		public void displayInfo()
		{
			System.out.println("책 제목 : " + title);
		}
	}
	
	
}
public class LibraryMain {

	public static void main(String[] args) {
		//라이브러리 인스턴스 생성
		Library my = new Library("나의 도서관");
		
		//출력
		System.out.println(my);
		
		
		//정적 내부 클래스 인스턴스 생성
		Library.Book bo = new Library.Book("자바 프로그래밍 입문");
		
		//책 정보 출력
		bo.displayInfo();
    }
}


