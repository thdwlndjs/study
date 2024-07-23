package CH14;

public class SportsCar implements Car{

	@Override
	public void SpeedUp() 
	{
		System.out.println("스포츠카의 속도를 높입니다");
	}
	@Override
	public void SpeedDown() 
	{
		System.out.println("스포츠카의 속도를 낮춥니다");
	}
	@Override
	public void Stop() 
	{
		System.out.println("스포츠카가 정지합니다");
	}
	
	public void turbo() 
	{
		System.out.println("고속 질주 기능입니다");
	}

}
