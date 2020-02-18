package exec10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream gravador;
		try {
			gravador = new PrintStream("saida.txt");
			gravador.println("abc");
			gravador.println("haha");
			gravador.println("1234");
			gravador.println("GGWP");
			gravador.println("Pede pra nerfar noob");
			gravador.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
