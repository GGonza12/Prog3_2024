package ejercicio_1;

import java.util.Comparator;

public class Ejercicio_1_lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String>compString = new ComparatorString();
		MySimpleLinkedList<String> lista3 = new MySimpleLinkedList<String>(compString);
		lista3.insertFront("cafe");
		lista3.insertFront("Pera");
		lista3.insertFront("datoG");
		lista3.insertFront("rojo");
		MySimpleLinkedList<String> lista2 = new MySimpleLinkedList<String>(compString);
		lista2.insertFront("rojo");
		lista2.insertFront("Pera");
		lista2.insertFront("f");
		lista2.insertFront("datoG");
		MySimpleLinkedList<String> lista = new MySimpleLinkedList<String>(compString);
		lista.insertFront("datoG");
		lista.insertFront("datoManzana");
		lista.insertFront("Pera");
		lista.insertFront("Jorge");
//		System.out.println(lista);
//		System.out.println(lista.size());
//		System.out.println(lista.get(0));
//		System.out.println(lista.extractFront());
	lista.insertFront("jamon");
//	System.out.println(lista.extractFront());
//	System.out.println(lista.size());
	lista.deleteNode(2);
//	System.out.println(lista.indexOf("pera"));
	
//	for(String i:lista) {
//		System.out.println(i);
//	}}
	System.out.println(lista2);
	System.out.println(lista3);

	System.out.println("probando ejercicio 5");
	
	System.out.println(lista3.ordernarListasComun(lista2, lista3));
	System.out.println("probando ejercicio 6");
	System.out.println(lista3.ordernarListasPrimera(lista2, lista3));
	
	
	}

}
