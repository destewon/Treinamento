/**
 * 
 */
package br.com.foursys.geraexcel.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import br.com.foursys.geraexcel.model.Aluno;

/**
 * Classe responsável por efetuar a leitura de arquivo xls
 * 
 * @author amendes
 *
 */
public class LerExcel {

	/**
	 * @param args
	 */

	public static final String fileNome = "C:/teste/teste.xls";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Aluno> listaAlunos = new ArrayList<Aluno>();

		try {
			FileInputStream arquivo = new FileInputStream(new File(LerExcel.fileNome));

			HSSFWorkbook workbook = new HSSFWorkbook(arquivo);

			HSSFSheet sheetAlunos = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheetAlunos.iterator();

			while (rowIterator.hasNext()) {

				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				Aluno aluno = new Aluno();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					case 0:
						System.out.print(cell.getStringCellValue()+ " - ");
						break;
					case 1:
						System.out.print(cell.getNumericCellValue()+ " - ");
						break;
					case 2:
						System.out.print(cell.getNumericCellValue()+ " - ");
						break;
					case 3:
						System.out.print(cell.getNumericCellValue()+ " - ");
						break;
					case 4:
						System.out.println(cell.getNumericCellValue());
						System.out.println();
						break;

					default:
						break;
					}

				}

			}

			arquivo.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Arquivo não encontrado!!");
			e.printStackTrace();
		}

	}

}
