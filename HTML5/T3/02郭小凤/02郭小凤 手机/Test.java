
public class Test {
	private static void aaa(Shou s) {
		if(s instanceof Putong){
			Putong p = (Putong)s;
			p.dianhua();
			p.bo("��ѩ");
			p.duanxin();
			
		}else if (s instanceof ZhiNeng) {
			ZhiNeng z=(ZhiNeng)s;
			z.bo("Сʱ��");
			z.dianhua();
			z.duanxin();
			
			z.sw();
		}

	}
	public static void main(String[] args) {
		Shou j=new Putong("G502c","���ᰣ");
		j.print();
		aaa(j);
		System.out.println();
		System.out.println("");
		System.out.println();
		System.out.println();
		Shou z = new ZhiNeng("T9100","HTC");
		z.print();
		aaa(z);
	}
}
