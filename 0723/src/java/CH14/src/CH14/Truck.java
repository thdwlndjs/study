package CH14;

public class Truck implements Car{
	@Override
	public void SpeedUp() 
	{
		System.out.println("트럭이 속도를 높입니다");
	}
	@Override
	public void SpeedDown() 
	{
		System.out.println("트럭이 속도를 낮춥니다");
	}
	@Override
	public void Stop() 
	{
		System.out.println("트럭이 정지합니다");
	}

}
