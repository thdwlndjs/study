package CH18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Java Collection Framework
 * 프레임워크 ~= 자료구조모음
 * 
 * + 장점
 * 객체지향적 설계를 통해 표준화 되어있다 => 사용법만 익히기에도 편리하고 재사용성이 높다.
 * 데이터 구조와 알고리즘의 고성능 구현을 통해 프로그램의 성능과 품질을 향상시킨다.
 * 관련없는 API간 상호 운용성을 제공(상위 인터페이스 타입으로 업캐스팅)한다.
 * 새로운 API구현하는 시간이 단축된다.
 * 
 * List와 Set는 컬렉션인터페이스를 상속받지만 Map은 구조상의 차이로 별도정의
 * List 순서가 있는 데이터 집합			데이터중복
 * Set 순서가 없는 데이터 집합				데이터중복X
 * Map 키-값의 쌍으로 리후어진 데이터 집합	순서유지X,키중복X,값중복O
 * 
 * List컬렉션
 * ArrayList
 * 단방향 포인터 구조, 순차적인접근에서 조회가 빠르다
 * 삽입삭제가 느리다 BUT 순차적으로 추가 삭제하는 경우에는 가장 빠르다
 * List<데이터타입>변수=new ArratList<데이터타입>();
 * void add(E e)					데이터 순차적 삽입
 * void add(int index, E e)			원하는 인덱스 위치에 삽입
 * void set(int index, E e)			원하는 인덱스 위치에 치환
 * E get(int index)					선택된 인덱스 반환
 * void remove(int index)			선택된 인덱스 삭제
 * void clear()						모두삭제
 * int size()						저장된 데이터개수반환
 * boolean contains(Object c)		존재여부확인
 */
public class CH18 {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("딸기");
//		list.add("바나나");
//		list.add("망고");
//		System.out.println("리스트 내용: " +list);
//		list.add(2,"수박");
//		System.out.println("리스트 내용2: " +list);
//		
//		List<String> f = new ArrayList<>();
//		f.add("사과");
//		f.add("배");
//		f.add("오렌지");
//		f.add("키위");
//		f.add("블루베리");
//		System.out.println("리스트 내용1: " +f);
//		f.add(4,"포도");
//		System.out.println("리스트 내용3: " +f);
//
//		List<String> u = new ArrayList<>();
//		u.add("딸기");
//		u.add("바나나");
//		u.add("망고");
//		System.out.println("리스트 내용1: " +u);
//		u.add(1,"복숭아");
//		u.add(0,"딸기");
//		System.out.println("리스트 내용3: " +u);
//		List<Integer> list = new ArrayList<>();
//		for(int i=1;i<10;i++) {
//			int temp = 2*1;
//			list.add(temp);
//		}
//		System.out.println("리스트 내용:"+list);
//		list.remove(3);
//		list.remove(Integer.valueOf(10));
//		System.out.println("리스트 내용2:"+list);
//		List<Integer>list=new ArrayList<>();
//		for(int i=1;i<10;i++) {
//			int temp = (int)(Math.random()*30)+1;
//			list.add(temp);
//		}
//		System.out.println("전체데이터: "+list);
//		System.out.println("짝수: ");
//		for(int i=1;i<list.size();i++) {
//			int value = list.get(i);
//			if (value%2==0)System.out.print(value+" ");
//		}
/*LinkedList 노드를 연결해 리스트처럼 만든 컬렉션(배열아님)
 *데이터의 중간삽입 삭제가 빈번할경우 빠른 성능을 보장
 *임의의 요소에 대한 접근 성능은 좋지 않다
 *자바 LinkedList는 양방향 포인터 구조로 이루어져있다
 */
		ArrayList<Integer> arr = new ArrayList<>();
		LinkedList<Integer> link = new LinkedList<>();
		long startTime = System.nanoTime();
		for(int i=0;i<1000000;i++) {
			arr.add(i);
		}
		long endTime = System.nanoTime();
		long duration = endTime-startTime;
		System.out.println("Arrraylist 추가시간: "+duration);
		
		startTime = System.nanoTime();
		for(int i=0;i<1000000;i++) {
			link.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime-startTime;
		System.out.println("LinkedList 추가시간: "+duration);
		//연속적일때는 Arrraylist가 빠르다
		startTime=System.nanoTime();
		arr.add(99,100);
		endTime = System.nanoTime();
		duration = endTime-startTime;
		System.out.println("Arrraylist 삽입시간: "+duration);
		startTime=System.nanoTime();
		link.add(99,100);
		endTime = System.nanoTime();
		duration = endTime-startTime;
		System.out.println("LinkedList 삽입시간: "+duration);
	}
}
