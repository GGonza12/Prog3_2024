package practico_2;

public class Ejercicio_5 {

	public static void main(String[] args) {

		 int[] A = {-3, -1, 0, 2, 4, 6, 10};
	        int resultado = buscar(A, 0, A.length - 1);
	        if (resultado == -1) {
	            System.out.println("No existe un índice i tal que A[i] = i");
	        } else {
	            System.out.println("El índice i tal que A[i] = i es: " + resultado);
	        }
	}
	
	  public static int buscar(int[] A, int inicio, int fin) {
	        if (inicio <= fin) {
	            int medio = inicio + (fin - inicio) / 2;
	            if (A[medio] == medio) {
	                return medio;
	            } else if (A[medio] > medio) {
	                return buscar(A, inicio, medio - 1);
	            } else {
	                return buscar(A, medio + 1, fin);
	            }
	        }
	        return -1;
	    }

}
