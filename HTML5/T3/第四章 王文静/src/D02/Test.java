package ����;
public class Test extends ShouJi implements YinYue,WenZi,YuYin,WangLuo,PaiZhao,ShiPin,TuWen{
	@Override
	public String bofang() {
		// TODO Auto-generated method stub
		return "��ʼ�������֡���Ѫ��......";
	}
	@Override
		public String fashong() {
			
			return "����������Ϣ.......";
	}
	@Override
	public String tonghua() {
		return "��ʼ����ͨ��.......";
		
	}
	public void getXinghao(String xinghao, String pinpai) {
		System.out.println("����һ���ͺ�Ϊ"+xinghao+"��"+pinpai+"���ֻ�");
	}
	public static void main(String[] args) {
		Test a = new Test();
		a.getXinghao("G502c","���ᰮ�����ֻ�");
		System.out.println(a.bofang());
		System.out.println(a.fashong());
		System.out.println(a.tonghua());
		a.getXinghao("Htc","I9100");
		System.out.println(a.qidong());
		System.out.println(a.bo());
		System.out.println(a.zhaoxiang());
		System.out.println(a.fas());
		System.out.println(a.tong());
	}
	@Override
	public String qidong() {
		return "�Ѿ������ƶ�����......";
	}
	@Override
	public String bo() {
		// TODO Auto-generated method stub
		return "��ʼ��Ƶ���š�Сʱ����......";
	}
	
	@Override
	public String zhaoxiang() {
		// TODO Auto-generated method stub
		return "�ǲ�.....���ճɹ�......";
	}
	@Override
	public String fas() {
		// TODO Auto-generated method stub
		return "���ʹ�ͼƬ�����ֵ���Ϣ......";
	}
	@Override
	public String tong() {
		// TODO Auto-generated method stub
		return "��ʼ��Ƶͨ��......";
	}
	

}
