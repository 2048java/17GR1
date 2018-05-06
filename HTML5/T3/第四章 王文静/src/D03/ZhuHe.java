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
		System.out.println("使用"+m.heibai()+"在"+z.A4()+"上打印");
		System.out.println("使用"+m.caishe()+"在"+z.B5()+"上打印");
		System.out.println("使用"+m.caishe()+"在"+z.A4()+"上打印");
	}
	
	

}
