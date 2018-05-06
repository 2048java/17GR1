package dayinji;

public class Dd extends Print implements InkBox , Paper {

	@Override
	public void zhi(String x) {
		System.out.println("在"+1+"纸张上打印");
	}

	@Override
	public void mohe(String z) {
		System.out.print("用"+2+"墨盒");
	}

	@Override
	public void dayin() {
		System.out.println();
	}
		
}
