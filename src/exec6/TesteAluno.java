package exec6;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class TesteAluno {

	public static void main(String[] args) {
		new Aluno("Anderson",1995,JOptionPane.showInputDialog("Digite sua data de nascimento"),"Treinamento Java","Barueri");
		
//		DateTime dataInicial = new DateTime(1995,06,02,0,0);
//		DateTime dataFinal = new DateTime(2020,02,13,0,0);
//		
//		int dias = Days.daysBetween(dataInicial,dataFinal).getDays();
//		
//		System.out.println(dias);
	}

}
