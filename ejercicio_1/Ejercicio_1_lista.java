package ejercicio_1;

public class Ejercicio_1_lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySimpleLinkedList<String> lista3 = new MySimpleLinkedList<String>();
		lista3.insertFront("cafe");
		lista3.insertFront("f");
		lista3.insertFront("DatoG");
		lista3.insertFront("Pera");
		MySimpleLinkedList<String> lista2 = new MySimpleLinkedList<String>();
		lista2.insertFront("rojo");
		lista2.insertFront("Pera");
		lista2.insertFront("pablo");
		lista2.insertFront("datoG");
		MySimpleLinkedList<String> lista = new MySimpleLinkedList<String>();
		lista.insertFront("datoG");
		lista.insertFront("datoManzana");
		lista.insertFront("Pera");
		lista.insertFront("Jorge");
		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println(lista.get(0));
		System.out.println(lista.extractFront());
	lista.insertFront("jamon");
	System.out.println(lista.extractFront());
	System.out.println(lista.size());
	lista.deleteNode(2);
	System.out.println(lista.indexOf("pera"));
	
	for(String i:lista) {
		System.out.println(i);
	}
	
	System.out.println(lista3.ordernarListasComun(lista2, lista3));
	
	
	
	}

}
