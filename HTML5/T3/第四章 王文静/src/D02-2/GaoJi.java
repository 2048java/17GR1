package 会员;
public class GaoJi extends ShouJi implements ZhaoXiang,ShangWang{
	public GaoJi(String leixing, String pinpai) {
		super(leixing, pinpai);
		
	}

	@Override
	public void wangluo() {
		System.out.println("已经启动移动网络......");
		
	}

	@Override
	public void print() {
		System.out.println("这是一款型号为："+super.getLeixing()+"的"+super.getPinpai()+"手机");
		
	}

	@Override
	public void wenzi() {
		System.out.println("发送带文字与图片信息......");
		
	}

	@Override
	public void tonghua() {
		// TODO Auto-generated method stub
		System.out.println("开始视频通话......");
	}

	@Override
	public void paizhao() {
		System.out.println("咔擦......拍照成功......");
		
	}

	public void bo(String name) {
		
		System.out.println("开始播放音乐《"+name+"》........");
	}
	
	

}
