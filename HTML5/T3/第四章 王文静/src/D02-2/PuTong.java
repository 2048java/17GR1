package 会员;
public class PuTong extends ShouJi implements YinYue{

	public PuTong(String leixing, String pinpai) {
		super(leixing, pinpai);
		
	}

	@Override
	public void bo(String name) {
		System.out.println("开始播放音乐《"+name+"》........");
		
	}

	@Override
	public void print() {
		System.out.println("这是一款型号为："+super.getLeixing()+"的"+super.getPinpai()+"手机");
		
		
	}

	@Override
	public void wenzi() {
		System.out.println("发送文字信息.......");
		
	}

	@Override
	public void tonghua() {
		System.out.println("开始语音通话.......");
		
	}

}
