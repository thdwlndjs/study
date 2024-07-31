package CH19;
interface StrTransform {
	String transform(String str1, String str2);
}
public class CH193 {
	public static void main(String[] args) {
		StrTransform st = // 람다식쓰면 훨씬 짧아진다.
				(str1,str2)->str1 +"-"+ str2 ;
//		String str1="java";
//		String str2="programming";
//		String result = st.transform(str1, str2);
		String result = st.transform("java", "programming");
		System.out.println(result);
//		return "result: "+str1+"-"+str2;
		//다른 반환타입?
	}
}
