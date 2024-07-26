package CH17;

//object:자바의 최상위믈래스
//system:시스템의 입출력
//string
//stringBuffer/stringBulider:문자열을 저장하고 내부 문자열을 조작
//math:수학함수
//==:객체를 비교할떄는 메모리에 있는 위치를 비교
//hashCode():객체마다의 고유값을 반환해 주민등록번호처럼 객체를 식별하는 정수값
//toString: 객체의 문자정보를 반환하는 클래스
	//print문을 사용할셩우 자동으로 실행되어 객체의 정보를 반환해준다.
	//재정의해서 사용하면 원하는 객체의 정보를 쉽게 출력할 수 있다.
public class CH17 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "apple";
		System.out.println("str1 hashCode:"+str1.hashCode());
		System.out.println("str2 hashCode:"+str2.hashCode());
		System.out.println("str3 hashCode:"+str3.hashCode());
		//object가 제공하는 hashcode메서드를 오버라이드 해서 사용
		




	}
}

//		System.out.println("str1 vs str2: "+(str1==str2));
//		System.out.println("str2 vs str3: "+(str2==str3));
//		System.out.println("str1 hashCode: "+System.identityHashCode(str1));
//		System.out.println("str2 hashCode: "+System.identityHashCode(str2));
//		System.out.println("str3 hashCode: "+System.identityHashCode(str3));
//		System.out.println("str1 hashCode: "+str1.equals(str3));
//		System.out.println("str1 hashCode: "+str2.equals(str3));
////왜 같은 주소를 어떻게 가지지?=>자료구조를 조금 공부할것.