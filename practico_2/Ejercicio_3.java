package practico_2;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertirABinario(26));
	}
	
	public static String convertirABinario(int n) {
		
		   if (n < 2) { // Caso base
	            return Integer.toString(n);
	        } else {
	            return convertirABinario(n / 2) + Integer.toString(n % 2);
	        }
	}

}
