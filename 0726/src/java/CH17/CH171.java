package CH17;

//String 클래스
//method
//int length()
//char charAt(): String을 char로 바꿔주는,,문자열을 하나의 단어 단위로 출력(파라미터로는 추출할 문자열의 위치를 받음)=매개변수
//int indexOf(String ch):문자열에 포함된 단어 또는 문자열의 위히응 앞에서부터 검색했을때
//int indexOf(int ch)일치하는 위치의 인덱스 값을 반환(없을경우 -1 반환)
//String substring(int beginIndex):문자열을 시작부터 마지막 위치까지 자를때 사용
//String substring(int beginIndex,int endIndex):시작부터 마지막위치"전"까지 리턴
//replaceAll(변경대상,변경할단어)
//StringBuilder가 지닌 대표적인 메서드
//append(String str)
//delete(int start,int end)
//insert()
//reverse()
//Math클래스
//int abs(int a)
//double abs(int a):절대값
//double ceil(double a):올림
//double floor(double a):내림
//double round(double a):반올림
//int(double) max()
//int(double) min()
public class CH171 {

	public static void main(String[] args) {
		System.out.println("3.51올림: " + Math.ceil(3.51));
		System.out.println("3.51내림: " + Math.floor(3.51));
		System.out.println("3.51반올림: " + Math.round(3.51));
		System.out.println("절대값: " + Math.abs(-4.51));
		int maxValue = Math.max(30, 60);
		System.out.println(maxValue);
		int minValue = Math.min(30, 60);
		System.out.println(minValue);
		int randValue = (int) (Math.random() * 30) + 1;
	}
}
// StringBuilder str = new StringBuilder("Hello");
// str.append(" World");
// System.out.println(str);
// System.out.println("문자열 길이: "+str.length());
// str.delete(0,6);
// System.out.println(str);
// System.out.println("문자열 길이: "+str.length());
// str.insert(0, "Hello ");
// System.out.println(str);
// System.out.println("문자열 길이: "+str.length());
// str.reverse();
// System.out.println(str);

// String str = "1234-5687";
// String substr=str.substring(5);
// System.out.println(substr);
// String substrr=str.substring(0,4);
// System.out.println(substrr);
//

// String str="자바는 HelloWorld_자바MyWorld";
// String newStr=str.replace("자바", "java");
// System.out.println("str");
// System.out.println("newStr");

// String str="HelloWorld_MyWorld";
// System.out.println("World 단어 위치 : "+str.indexOf("World"));
// System.out.println("World 단어 위치 : "+str.indexOf("World",10));

// String word ="1I2Love6You";
// String text = "";
// for(int i=0;i<word.length();i++) {
// char ch = word.charAt(i);
// int ascciNum = ch;//뭐한건데 이게
// if((ascciNum>=65 && ascciNum<=90)||(ascciNum>=97&&ascciNum<=122)){//소문자이거나
// 대문자이면
// text+=ch;
// }
// else {
// text+=" ";
// }
// }
// System.out.println(text);