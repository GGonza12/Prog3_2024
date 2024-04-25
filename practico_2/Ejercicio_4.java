package practico_2;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int N = 10; // Cambia este valor por el número de términos que deseas generar
	        for (int i = 0; i < N; i++) {
	            System.out.println(fibonacci(i));
	        }
	}
	
	 public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	        
	 }

}
