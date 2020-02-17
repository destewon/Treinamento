package exec6;

import java.time.Year;
import java.util.Calendar;
import java.util.regex.Pattern;

import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * Classe responsável por efetuar o controle de locação de filme
 * @author amendes
 * @since 12/02/2020
 * @version 0.1
 */

public class Aluno {
	
	String nome;
	int anoNascimento;
	String curso;
	String cidade;
	String mesNascimento;
	String dataNascimento;
	
	public Aluno() {
		
		
	}

	public Aluno(String nome, int anoNascimento,String dataNascimento, String curso, String cidade) {
		
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.dataNascimento = dataNascimento;
		this.curso = curso;
		this.cidade = cidade;
		exibirTudo();
	}
	
	public int idade() {
		Year y = Year.now();
		int ano = y.getValue();
		
		int idade = ano - anoNascimento;
		
		//int teste = Integer.parseInt(idadeCompleta());
		
		
		
		return idade;
		
	}
	
	public String idadeExtenso() {
		int idade = idadeCompleta();
		int idadeAnoMod = idade%365;
		int idadeMesMod = idadeAnoMod%30;
		
		
		int idadeAno = idade/365;
		int idadeMes = idadeAnoMod/30;
		int idadeDia = idadeMesMod%30;
		
		String idadeTotal="\nAnos: "+ idadeAno + "\nMeses: "+idadeMes+"\nDias: "+idadeDia+"\n";
		
		return idadeTotal;
		
		
	}
	public int idadeCompleta() {
		//Calendar y = Calendar.getInstance();
		//String ano = y.getCalendarType();
		//ano = ano.replace('/', ' ');
		//ano = ano.trim();		
		//int ano2 = Integer.parseInt(ano);
		//String dataAno =(new java.text.SimpleDateFormat("yyyy").format(new java.util.Date(System.currentTimeMillis())));
		/*
		 * String dataMes =(new java.text.SimpleDateFormat("MM").format(new
		 * java.util.Date(System.currentTimeMillis()))); String dataDia =(new
		 * java.text.SimpleDateFormat("dd").format(new
		 * java.util.Date(System.currentTimeMillis())));
		 */
		/*
		 * dataNascimento = dataNascimento.replace('/', ' '); dataNascimento =
		 * dataNascimento.trim(); String anoNascimento = dataNascimento.substring(6,10);
		 * String mesNascimento = dataNascimento.substring(3,5); String diaNascimento =
		 * dataNascimento.substring(0,2);
		 */
		
		/*
		 * int dataAno2 = Integer.parseInt(dataAno); int dataMes2 =
		 * Integer.parseInt(dataMes); int dataDia2 = Integer.parseInt(dataDia);
		 */
//		int anoNascimento2 = Integer.parseInt(anoNascimento);
//		int mesNascimento2 = Integer.parseInt(mesNascimento);
//		int diaNascimento2 = Integer.parseInt(diaNascimento);
//		
//		int totalAno = dataAno2-anoNascimento2;
//		int totalMes = dataMes2-mesNascimento2;
//		int totalDia = dataDia2 - diaNascimento2;
//		
//		
//		if (totalDia<0) {
//			totalMes-=1;
//			totalDia+=30;
//		}
//		if (totalMes<0) {
//			totalAno-=1;
//			totalMes+=12;
//		}
//		
//		if (totalAno<0) {
//			
//		}
//		int totalDeDias = (totalAno*365)+(totalMes*30)+totalDia;
		
		String dataAno =(new java.text.SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date(System.currentTimeMillis())));
		String dataAtual[] = dataAno.split("/");
		int anoAtual = Integer.parseInt(dataAtual[2]);
		int mesAtual = Integer.parseInt(dataAtual[1]);
		int diaAtual = Integer.parseInt(dataAtual[0]);
		
		String data[] = dataNascimento.split("/");
		int ano = Integer.parseInt(data[2]);
		int mes = Integer.parseInt(data[1]);
		int dia = Integer.parseInt(data[0]);
		
		
		
		DateTime dataInicial = new DateTime(ano,mes,dia,0,0);
		DateTime dataFinal = new DateTime(anoAtual,mesAtual,diaAtual,0,0);
		
		int dias = Days.daysBetween(dataInicial,dataFinal).getDays();
		
		return (dias);
		
		
				
		//int data2 = Integer.parseInt(data);
		
		//dataNascimento = dataNascimento.replace('/', ' ');
		//dataNascimento = dataNascimento.trim();
		//int dataNascimento2 = Integer.parseInt(dataNascimento);		
		//int idade = ano2-dataNascimento2;
//		dataNascimento=(new java.text.SimpleDateFormat("yyyyMMdd").format(dataNascimento));
//		int dataNascimento2=Integer.parseInt(dataNascimento);
		
		//return totalDeDias;
		
	}
	
	public void exibirTudo() {
		System.out.println(nome);
		System.out.println("Idade apenas em anos: "+idade());
		System.out.println(idadeExtenso());		
		System.out.println("Dias de Vida: "+idadeCompleta());
		System.out.println(curso);
		System.out.println(cidade);

	}

	
	
}
