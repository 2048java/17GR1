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
		System.out.println("���������Ϣ���£�");
		System.out.println("CPU��Ʒ����:"+c.getCPUXinghao()+",��Ƶ��:"+c.getCPUzhupin());
		System.out.println("Ӳ��������:"+h.getHDronliang());
		System.out.println("�ڴ�������:"+e.getEMSname());
	}
}
