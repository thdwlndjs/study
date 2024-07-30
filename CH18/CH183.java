package CH18;

import java.util.HashMap;
import java.util.Map;

/*
 * Map
 * 키-값
 * 값은 중복, 키는 X(덮어씌워짐)
 * 저장순서가 유지되지 않는다
 * 메서드
 * void put(K key, V value)		키와 값의 쌍을 삽입
 * E get(K key)					키와 연결된 값을 반환
 * boolen contrainsKey(K key)	키가 존재하는지 확인
 * boolen contrainsValue(V value)		,,
 * set<E> keySet()				맵에 포함된 모든 키를 Set으로 반환
 * set<Map.Entry>entrySet				,,
 */
public class CH183 {
	public static void main(String[] args) {
		Map<String, String>map=new HashMap<>();
		map.put("spring","봄");
		map.put("summer","여름");
		map.put("fail","가을");
		map.put("winter","겨울");

		map.put("spring","봄봄");//key중복이면 최신화
		map.remove("winter");
		System.out.println("IsKeyExist: "+map.containsKey("winter"));
		System.out.println("IsValueExist: "+map.containsValue("가을"));
		System.out.println("getKey: "+map.get("spring"));



	}
}
