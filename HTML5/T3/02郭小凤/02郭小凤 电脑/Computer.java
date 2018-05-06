package F4;

public class Computer {
	CPU c;
	Ee e;
	HardDisk h;
	public HardDisk getH() {
		return h;
	}
	public void setH(HardDisk h) {
		this.h = h;
	}
	public CPU getC() {
		return c;
	}
	public void setC(CPU c) {
		this.c = c;
	}
	public Ee getE() {
		return e;
	}
	public void setE(Ee e) {
		this.e = e;
	}
	
public void show(){
		System.out.println("计算机的信息如下：");
		System.out.println("CPU的品牌是:"+c.getCPUXinghao()+",主频是:"+c.getCPUzhupin());
		System.out.println("硬盘容量是:"+h.getHDronliang());
		System.out.println("内存容量是:"+e.getEMSname());
	}
}
