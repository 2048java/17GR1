package F2;

public class Fdm extends Door implements Suo,MenLing {
	
	public Fdm() {
		super();
		// TODO Auto-generated constructor stub
	}


	

@Override
public String ml() {
	// TODO Auto-generated method stub
	return "�塭�����ꡭ����Ƭ�Ѵ洢��";
}

@Override
public String ss() {
	// TODO Auto-generated method stub
	return "���Կ�ף�������תԿ����Ȧ�������ˣ��γ�Կ��";
}

@Override
public String ks() {
	// TODO Auto-generated method stub
	return "���Կ�ף�������תԿ����Ȧ�������ˣ��γ�Կ��";
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
