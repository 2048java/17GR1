package dayinji;

public class Dd extends Print implements InkBox , Paper {

	@Override
	public void zhi(String x) {
		System.out.println("��"+1+"ֽ���ϴ�ӡ");
	}

	@Override
	public void mohe(String z) {
		System.out.print("��"+2+"ī��");
	}

	@Override
	public void dayin() {
		System.out.println();
	}
		
}
