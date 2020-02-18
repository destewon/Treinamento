package exec10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Teste03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			File arquivo = new File("saida.txt");
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo,true);
			PrintStream gravador = new PrintStream(arquivoOutput);
			gravador.println("Coisas");
			gravador.println("Shine");
			gravador.println("File");
			gravador.println("Generate");
			gravador.println("SLC");
			gravador.close();
			arquivoOutput.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
