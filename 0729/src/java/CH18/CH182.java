package CH18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*Iterator:반복하다
 *List 컬렉션의 요소를 순회하여 하나씩 추출하는데 사용 
 *메서드
 *boolean hashNext() 	다음에 순회할 데이터 유무확인(T/F)
 *E next()				다음위치의 데이터로 이동해 반환
 */
public class CH182 {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int val = it.next();
			int count=0;
			System.out.println("list데이터["+(count++)+"] : "+val);
		}
	}
}
