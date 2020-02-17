package exec6;

public class SeparaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Método para separar o dia, mês, ano
				String data1 = "12/02/2020";
				String datas1[] = data1.split("/");
				System.out.println("Primeira separação");
				for (String x : datas1) {
					System.out.println(x);
				}

				//Método para separar o dia, mês, ano
				String data2 = "12/02/2020";
				String datas2[] = data1.split("/");
				
				System.out.println("Segunda separação");
				System.out.println(datas2[0]);
				System.out.println(datas2[1]);
				System.out.println(datas2[2]);
	}

}
