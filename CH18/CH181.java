package CH18;

import java.util.HashSet;

/*Iterator:반복하다
 *List 컬렉션의 요소를 순회하여 하나씩 추출하는데 사용 
 *메서드
 *boolean hashNext() 	다음에 순회할 데이터 유무확인(T/F)
 *E next()				다음위치의 데이터로 이동해 반환
 */
public class CH181 {
	public static void main(String[] args) {
		HashSet<String>set=new HashSet<>();
		set.add("사과");
		set.add("바나나");
		set.add("체리");
		set.add("바나나");
		System.out.println(set);
		set.remove("바나나");
		set.remove("체리");
		System.out.println(set);
	}
}
