
public abstract class Shou {
	private String xinghao;
	private String pinpai;
	public Shou (String xinghao,String pinpai) {
		super();
		this.xinghao = xinghao;
		this.pinpai = pinpai;
	}
	public String getXinghao() {
		return xinghao;
	}
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	public String getPinpai() {
		return pinpai;
	}
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	public Shou(){
		super();
	}
	public abstract void print();
	public abstract void duanxin();
	public abstract void dianhua();
	
}
