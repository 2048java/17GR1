package shouji;

public class Test {
		public static void main(String[] args) {
			CommonHandest ch = new CommonHandest();
			ch.info("x20", "vivo");
			ch.play("xx");
			ch.sendInfo();
			ch.call();
			
			System.out.println();
			
			AptitudeHandest ah = new AptitudeHandest();
			ah.info("r15", "oppo");
			ah.networkConn();
			ah.play("¡¶Ð¡Ê±´ú¡·");
			ah.takePictures();
			ah.sendInfo();
			ah.call();
		}
}
