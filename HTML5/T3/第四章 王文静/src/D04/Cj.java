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
	System.out.println("Cpu��Ʒ����:"+pinpai()+"��Ƶ��:"+zhuping());
	
}
public static void main(String[] args) {
	Cj  d = new Cj ();
	d.fangFa();
	System.out.println("Ӳ��������:"+d.rongliang());
	System.out.println("�ڴ�������:"+d.rongliang2());
	
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
