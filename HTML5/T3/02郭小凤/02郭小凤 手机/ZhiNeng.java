
public class ZhiNeng extends Shou implements PaiZhao,ShangWang,BoFang{
	public ZhiNeng(){
		super();
	}
	public ZhiNeng(String duanxin,String dianhua){
		super(duanxin,dianhua);
	}

	@Override
	public void bo(String name) {
		System.out.println("��ʼ������Ƶ��Сʱ��������");
		
	}



	@Override
	public void pai() {
		System.out.println("���ꡭ�����ճɹ�����");
		
	}

	

	@Override
	public void duanxin() {
		System.out.println("����ͼƬ��������Ϣ����");
		
	}

	@Override
	public void dianhua() {
		System.out.println("��ʼ��Ƶͨ������");
		
	}
	@Override
	public void print() {
		System.out.println("����һ���ͺ�Ϊ��"+ super.getXinghao()+"��"+super.getPinpai()+"�ֻ�:");
		
	}
	@Override
	public void sw() {
		System.out.println("�Ѿ���������������");
		
	}
	
}
