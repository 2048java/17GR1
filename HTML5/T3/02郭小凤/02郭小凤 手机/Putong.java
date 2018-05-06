
public class Putong extends Shou implements BoFang{
	public Putong() {
		super();
	}
	public Putong(String duanxin,String dianhua) {
		super(duanxin,dianhua);
	}
	@Override
	public void bo(String name) {
		System.out.println("开始播放音乐《热血》……");
		
	}

	@Override
	public void duanxin() {
		System.out.println("发送文字信息……");
		
	}
	@Override
	public void dianhua() {
		System.out.println("开始语音通话……");
		
	}
	@Override
	public void print() {
		System.out.println("这是一款型号为："+super.getXinghao()+"的"+super.getPinpai()+"手机");
		
	}

	
}
