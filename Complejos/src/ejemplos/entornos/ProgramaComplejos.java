package ejemplos.entornos;

public class ProgramaComplejos {
	public static void main(String[] args){
		
		/**
		 * Operaciones con n�meros complejos
		 * @author Javier Molina Maqueda
		 * @version 29.5.2019
		 */
		
		NumComplejo num1=new NumComplejo(2,3);
		NumComplejo num2=new NumComplejo(2,1);
		NumComplejo res=new NumComplejo();
		
		System.out.println("Programa que opera con números complejos");
		System.out.println("========================================");
		
		System.out.println("Suma:");
		res=NumComplejo.sumarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("Resta:");
		res=NumComplejo.restarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("Multiplicación:");
		res=NumComplejo.multiplicarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("División:");
		res=NumComplejo.dividirComplejos(num1,num2);
		System.out.println(res);
	}

}
