package ��Ա;
public class GaoJi extends ShouJi implements ZhaoXiang,ShangWang{
	public GaoJi(String leixing, String pinpai) {
		super(leixing, pinpai);
		
	}

	@Override
	public void wangluo() {
		System.out.println("�Ѿ������ƶ�����......");
		
	}

	@Override
	public void print() {
		System.out.println("����һ���ͺ�Ϊ��"+super.getLeixing()+"��"+super.getPinpai()+"�ֻ�");
		
	}

	@Override
	public void wenzi() {
		System.out.println("���ʹ�������ͼƬ��Ϣ......");
		
	}

	@Override
	public void tonghua() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ��Ƶͨ��......");
	}

	@Override
	public void paizhao() {
		System.out.println("�ǲ�......���ճɹ�......");
		
	}

	public void bo(String name) {
		
		System.out.println("��ʼ�������֡�"+name+"��........");
	}
	
	

}
