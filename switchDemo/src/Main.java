
public class Main {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel: Geçtiniz");
			break;
		case 'B': // B ve C aynı sonucu versin istersek böyle yazarız
		case 'C':
			System.out.println("Fena Değil: Geçtiniz");
			break;
		case 'D':
			System.out.println("Maalesef Kaldınız");
			break;
		default: //A B C D dışında bir harf girerse
				System.out.println("Geçersiz not girdiniz");
		}

	}

}
