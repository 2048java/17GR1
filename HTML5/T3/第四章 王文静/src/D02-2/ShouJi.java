package ª·‘±;
public abstract class ShouJi {
	public String leixing;
	public String pinpai;
	public ShouJi(String leixing,String pinpai){
		super();
		this.leixing = leixing;
		this.pinpai = pinpai;
	}

	public String getLeixing() {
		return leixing;
	}
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	public String getPinpai() {
		return pinpai;
	}
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	public abstract void print();
	public abstract void wenzi();
	public abstract void tonghua();

}
