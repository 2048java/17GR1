
public class Putong extends Shou implements BoFang{
	public Putong() {
		super();
	}
	public Putong(String duanxin,String dianhua) {
		super(duanxin,dianhua);
	}
	@Override
	public void bo(String name) {
		System.out.println("��ʼ�������֡���Ѫ������");
		
	}

	@Override
	public void duanxin() {
		System.out.println("����������Ϣ����");
		
	}
	@Override
	public void dianhua() {
		System.out.println("��ʼ����ͨ������");
		
	}
	@Override
	public void print() {
		System.out.println("����һ���ͺ�Ϊ��"+super.getXinghao()+"��"+super.getPinpai()+"�ֻ�");
		
	}

	
}
