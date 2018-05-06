package D04;
public class Cj implements Cpu , Ems , YingPan {

	@Override
	public String pinpai() {
		// TODO Auto-generated method stub
		return "Intel";
	}

	@Override
	public String zhuping() {
		// TODO Auto-generated method stub
		return "3.8GHz";
	}
public void fangFa(){
	System.out.println("Cpu的品牌是:"+pinpai()+"主频是:"+zhuping());
	
}
public static void main(String[] args) {
	Cj  d = new Cj ();
	d.fangFa();
	System.out.println("硬盘容量是:"+d.rongliang());
	System.out.println("内存容量是:"+d.rongliang2());
	
}

@Override
public String rongliang() {
	// TODO Auto-generated method stub
	return "3000GB";
}
public String rongliang2() {
	// TODO Auto-generated method stub
	return "4GB";
}
}
