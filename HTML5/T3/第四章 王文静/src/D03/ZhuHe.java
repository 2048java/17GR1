package D03;
public class ZhuHe {
	MoHe m;
	ZhiZhang z;
	public MoHe getM() {
		return m;
	}
	public void setM(MoHe m) {
		this.m = m;
	}
	public ZhiZhang getZ() {
		return z;
	}
	public void setZ(ZhiZhang z) {
		this.z = z;
	}
	public void fangFa(){
		System.out.println("ʹ��"+m.heibai()+"��"+z.A4()+"�ϴ�ӡ");
		System.out.println("ʹ��"+m.caishe()+"��"+z.B5()+"�ϴ�ӡ");
		System.out.println("ʹ��"+m.caishe()+"��"+z.A4()+"�ϴ�ӡ");
	}
	
	

}
