package exec9;

public class Matematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x=10,y=20.5,z=-30;
		
		double abs=Math.abs(z);
		//valor absoluto
		System.out.println("Numero absoluto de Z: "+abs);
		//retorna maior valor inteiro
		double ceil=Math.ceil(y);
		System.out.println(ceil);
		//retorna menor valor inteiro
		double floor=Math.floor(y);
		System.out.println(floor);
		//retorna logaritmo
		double log=Math.log(x);
		System.out.println(log);
		//retorna o maior valor entre eles
		double max = Math.max(x, y);
		System.out.println(max);
		//retorna o menor valor entre eles
		double min = Math.min(x, y);
		System.out.println(min);
		//potencia
		double pow = Math.pow(x, 2);
		System.out.println(pow);
		//raiz quadrada
		double sqrtd = Math.sqrt(x);
		System.out.println(sqrtd);
		//seno, cosseno e tangente
		double cos = Math.cos(y);
		double sin = Math.sin(y);
		double tan = Math.tan(y);
		
		
		
	}

}
