package d3;

public class Shiyong {
	Mohe m;
	Zhi z;
	public Mohe getM() {
		return m;
	}
	public void setM(Mohe m) {
		this.m = m;
	}
	public Zhi getZ() {
		return z;
	}
	public void setZ(Zhi z) {
		this.z = z;
	}
	public void print(){
		System.out.println("使用"+m.heibai()+"在"+z.A4()+"上打印");
		System.out.println("使用"+m.cai()+"在"+z.B5()+"上打印");
		System.out.println("使用"+m.cai()+"在"+z.A4()+"上打印");

	}

}
