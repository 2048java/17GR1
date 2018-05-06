package 第四;
public class Test extends ShouJi implements YinYue,WenZi,YuYin,WangLuo,PaiZhao,ShiPin,TuWen{
	@Override
	public String bofang() {
		// TODO Auto-generated method stub
		return "开始播放音乐《热血》......";
	}
	@Override
		public String fashong() {
			
			return "发送文字信息.......";
	}
	@Override
	public String tonghua() {
		return "开始语音通话.......";
		
	}
	public void getXinghao(String xinghao, String pinpai) {
		System.out.println("这是一款型号为"+xinghao+"的"+pinpai+"牌手机");
	}
	public static void main(String[] args) {
		Test a = new Test();
		a.getXinghao("G502c","索尼爱立信手机");
		System.out.println(a.bofang());
		System.out.println(a.fashong());
		System.out.println(a.tonghua());
		a.getXinghao("Htc","I9100");
		System.out.println(a.qidong());
		System.out.println(a.bo());
		System.out.println(a.zhaoxiang());
		System.out.println(a.fas());
		System.out.println(a.tong());
	}
	@Override
	public String qidong() {
		return "已经启动移动网络......";
	}
	@Override
	public String bo() {
		// TODO Auto-generated method stub
		return "开始视频播放《小时代》......";
	}
	
	@Override
	public String zhaoxiang() {
		// TODO Auto-generated method stub
		return "咔擦.....拍照成功......";
	}
	@Override
	public String fas() {
		// TODO Auto-generated method stub
		return "发送带图片与文字的信息......";
	}
	@Override
	public String tong() {
		// TODO Auto-generated method stub
		return "开始视频通话......";
	}
	

}
