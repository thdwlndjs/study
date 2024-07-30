package CH19;

interface StringComparetor {
	int compare(String str1, String str2);
}

public class CH191 {
	public static void main(String[] args) {
		StringComparetor sc = // 람다식쓰면 훨씬 짧아진다.
				(str1, str2) -> str1.compareTo(str2);
		String str1 = "apple";
		String str2 = "banana";
		int result = sc.compare(str1, str2);
		if (result > 0)
			System.out.println("apple>banana");
		else if (result < 0)
			System.out.println("banana>apple");
		else
			System.out.println("=");
	}
}
