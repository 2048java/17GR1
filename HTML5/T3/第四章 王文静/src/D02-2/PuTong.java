package ��Ա;
public class PuTong extends ShouJi implements YinYue{

	public PuTong(String leixing, String pinpai) {
		super(leixing, pinpai);
		
	}

	@Override
	public void bo(String name) {
		System.out.println("��ʼ�������֡�"+name+"��........");
		
	}

	@Override
	public void print() {
		System.out.println("����һ���ͺ�Ϊ��"+super.getLeixing()+"��"+super.getPinpai()+"�ֻ�");
		
		
	}

	@Override
	public void wenzi() {
		System.out.println("����������Ϣ.......");
		
	}

	@Override
	public void tonghua() {
		System.out.println("��ʼ����ͨ��.......");
		
	}

}
