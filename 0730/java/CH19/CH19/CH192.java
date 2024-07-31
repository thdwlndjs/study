package CH19;

interface StrConcat {
	String concat(String str1, String str2);
}

public class CH192 {
	public static void main(String[] args) {
		final String str = "java";

		StrConcat sc = (s, v) -> {
			String setence = str + "!" + s + " " + v;
			return setence;
		};
		String result = sc.concat("nun", "language");
		System.out.println(result);

	}
}
