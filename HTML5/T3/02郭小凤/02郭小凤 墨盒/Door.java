package F2;

public abstract class Door implements Kaimen,Guanmen{
	@Override
	public String guan() {
		// TODO Auto-generated method stub
		return"轻轻拉门，门关上了";
	}

	@Override
	public String kai() {
		// TODO Auto-generated method stub
		return "用力推，门打开了";
	}
	

	
}
