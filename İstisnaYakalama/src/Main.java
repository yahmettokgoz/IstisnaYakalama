import java.io.IOException;

public class Main {

	public static void yasKontrol(int yas) throws IOException {
		if(yas<18) {
			throw new IOException();
		}else {
			System.out.println("Yasal yaştasınız.");
		}
	}

	public static void main(String[] args) {

		try {
			yasKontrol(14);
		} catch (IOException e) {
			System.out.println("Yaşınız 18'den küçük.");
		}
	}

}
