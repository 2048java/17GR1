package F2;

public class Fdm extends Door implements Suo,MenLing {
	
	public Fdm() {
		super();
		// TODO Auto-generated constructor stub
	}


	

@Override
public String ml() {
	// TODO Auto-generated method stub
	return "铃……咔嚓……照片已存储。";
}

@Override
public String ss() {
	// TODO Auto-generated method stub
	return "插进钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙";
}

@Override
public String ks() {
	// TODO Auto-generated method stub
	return "插进钥匙，向佑旋转钥匙三圈，锁打开了，拔出钥匙";
}
public static void main(String[] args) {
	Fdm f=new Fdm();
	System.out.println(f.guan());
	System.out.println(f.ss());
	System.out.println(f.ml());
	System.out.println(f.ks());
	System.out.println(f.kai());
}

	
	
	
	
}
