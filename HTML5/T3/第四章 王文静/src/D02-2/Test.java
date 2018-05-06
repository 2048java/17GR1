package 会员;
public class Test {
public static void gei(ShouJi s){
	if(s instanceof PuTong){
		PuTong p = (PuTong)s;
		p.bo("初雪");
		p.wenzi();
		p.tonghua();
	}else if(s instanceof GaoJi){
		GaoJi g = (GaoJi)s;
		g.wangluo();
		g.bo("小时代");
		g.paizhao();
		g.wenzi();
		g.tonghua();	
	}
		
	}

public static void main(String[] args) {
	ShouJi p = new PuTong ("G502c","索尼爱立");
	p.print();
	gei(p);
	ShouJi g = new GaoJi ("HTC","T9100");
	g.print();
	gei(g);
	
	
}


}
