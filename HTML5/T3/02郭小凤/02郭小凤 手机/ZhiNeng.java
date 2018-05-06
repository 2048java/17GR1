
public class ZhiNeng extends Shou implements PaiZhao,ShangWang,BoFang{
	public ZhiNeng(){
		super();
	}
	public ZhiNeng(String duanxin,String dianhua){
		super(duanxin,dianhua);
	}

	@Override
	public void bo(String name) {
		System.out.println("开始播放视频《小时代》……");
		
	}



	@Override
	public void pai() {
		System.out.println("咔嚓……拍照成功……");
		
	}

	

	@Override
	public void duanxin() {
		System.out.println("发送图片与文字信息……");
		
	}

	@Override
	public void dianhua() {
		System.out.println("开始视频通话……");
		
	}
	@Override
	public void print() {
		System.out.println("这是一款型号为："+ super.getXinghao()+"的"+super.getPinpai()+"手机:");
		
	}
	@Override
	public void sw() {
		System.out.println("已经启动互联网……");
		
	}
	
}
