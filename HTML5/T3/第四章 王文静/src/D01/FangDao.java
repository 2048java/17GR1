package 第四章;

public  class FangDao extends Men implements Suo , PaiZhao {

	@Override
	public String shangsuo() {
		
		return "SUO shangsuo le";
	}
public String chucun() {
		
		return "铃。。。。。。。咔嚓。。。。。。照片已储存";
	}

	@Override
	public String kaisuo() {
		// TODO Auto-generated method stub
		return"SUO kaisuo le";
	}
	public static void main(String[] args) {
		FangDao  fa = new FangDao();
		System.out.println(fa.guan());
		System.out.println(fa.shangsuo());
		System.out.println(fa.chucun());
		System.out.println(fa.kaisuo());
		System.out.println(fa.oppt());
		
		
	}



}
