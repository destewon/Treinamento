/**
 * 
 */
package br.com.foursys.geraexcel.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import br.com.foursys.geraexcel.model.Aluno;
import jdk.nashorn.internal.runtime.ListAdapter;

/**
 * @author amendes
 *
 */
public class CriarExcel {

	/**
	 * classe responsavel por criar um arquivo excel xls
	 * @param args
	 */
	
	public static final String fileNome = "C:/teste/novo.xls";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		HSSFSheet sheetAlunos = workbook.createSheet("Alunos");
		
		List<Aluno> ListaAlunos = new ArrayList<Aluno>();
		
		ListaAlunos.add(new Aluno("Anderson","123",10.0,10.0,10.0,true));
		ListaAlunos.add(new Aluno("Matheus","321",9.0,8.0,10.0,true));
		ListaAlunos.add(new Aluno("Leo","456",8.0,9.0,10.0,true));
		ListaAlunos.add(new Aluno("Enzo","654",5.0,5.0,5.0,false));
		ListaAlunos.add(new Aluno("Patrick","789",5.0,4.0,3.0,false));
		ListaAlunos.add(new Aluno("Isaac","987",4.0,2.0,3.0,false));
		
		
		int rowNum = 0;
		
		for (Aluno aluno : ListaAlunos) {
			
			Row row = sheetAlunos.createRow(rowNum++);
			
			int cellNum = 0;
			
			Cell cellNome = row.createCell(cellNum++);
			cellNome.setCellValue(aluno.getNome());
			
			Cell cellRa = row.createCell(cellNum++);
			cellRa.setCellValue(aluno.getRa());
			
			Cell cellNota1 = row.createCell(cellNum++);
			cellNota1.setCellValue(aluno.getNota1());
			
			Cell cellNota2 = row.createCell(cellNum++);
			cellNota2.setCellValue(aluno.getNota2());
			
			
			Cell cellMedia = row.createCell(cellNum++);
			cellMedia.setCellValue((aluno.getNota1()+aluno.getNota2())/2);
			
			Cell cellAprovado = row.createCell(cellNum++);
			cellAprovado.setCellValue(cellMedia.getNumericCellValue()>=7);
			
			
		}
		
		
		try {
			FileOutputStream out = new FileOutputStream(new File(CriarExcel.fileNome));
			
			workbook.write(out);
			
			out.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro na criação do arquivo.");
			e.printStackTrace();
		}
		
		System.out.println("Arquivo criado com sucesso!!");
		
		
		
		
		
		

	}

}
