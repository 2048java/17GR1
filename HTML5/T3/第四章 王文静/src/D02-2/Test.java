package ��Ա;
public class Test {
public static void gei(ShouJi s){
	if(s instanceof PuTong){
		PuTong p = (PuTong)s;
		p.bo("��ѩ");
		p.wenzi();
		p.tonghua();
	}else if(s instanceof GaoJi){
		GaoJi g = (GaoJi)s;
		g.wangluo();
		g.bo("Сʱ��");
		g.paizhao();
		g.wenzi();
		g.tonghua();	
	}
		
	}

public static void main(String[] args) {
	ShouJi p = new PuTong ("G502c","���ᰮ��");
	p.print();
	gei(p);
	ShouJi g = new GaoJi ("HTC","T9100");
	g.print();
	gei(g);
	
	
}


}
