package practico_2;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int resultado = BinariaRecursiva(arreglo,4,0,arreglo.length-1);
		
		System.out.println(resultado);
	}
	
	
	public static int BinariaRecursiva(int [] A, int X, int inicio, int fin)
	{
	int medio;
		if (inicio > fin) return -1; //sucederá si no se encuentra el elemento
		else {
			medio = (inicio + fin) / 2; //al ser medio un int, se realiza un truncado (pierde la parte decimal)
			if (X > A[medio])
		return BinariaRecursiva(A, X, medio+1, fin);
		else
		if (X < A[medio])
		return BinariaRecursiva(A, X, inicio, medio -1);
	else
	return medio;
	}
	}

}
