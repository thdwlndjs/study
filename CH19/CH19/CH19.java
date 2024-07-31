package CH19;
/*람다 표현식: 메소드를 간결한 함수식으로 표현한것
 * 이름없는함수=익명함수
 * (x,y)->{return x+y}
 * 매개변수가 한개면 소괄호 생략가능>								>>	str->{System.out.println()}
 * 함수 구현이 한문장이거나 return이 없으면(=void) 중괄호 생략가능)>	>> 	(x,y)->System.out.println()
 * 중괄호 안 구현코드가 return만 존재할때 중괄호와 return 모두 생략가능
 * (x,y)->{retutn x > y ? 1 : 0}	>>>>	(x,y)-> x > y ? 1 : 0
 */

interface CompareNumber {
	int compareTo(int num01, int num02);
}

public class CH19 {
	public static void main(String[] args) {
//		CompareNumber cp = new CompareNumber() {
//
//			@Override
//			public int compareTo(int num01, int num02) {
//				return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
//			}
//			
//		};//이거 람다식쓰면 두줄컷
		CompareNumber cp = (num01, num02) -> num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
		int num01 = 10;
		int num02 = 20;

		int result = cp.compareTo(num01, num02);

		if (result > 0)
			System.out.println("num01>num02");
		else if (result < 0)
			System.out.println("num02>num01");
		else
			System.out.println("=");

	}
}
