import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//For
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
			
		}
		System.out.println("For Döngü Bitti");
			
		//While
		int i=2;
		while (i<10) {
			System.out.println(i);
			i+=2;
			}
		System.out.println("While Döngü Bitti");
		
		//Do-While
		int j=1;
		do {
			//System.out.println("Loglandı");
			//if bunu şart sağlanmadığında yaparız
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("Do-While Döngü Bitti");
		}
	

	}
