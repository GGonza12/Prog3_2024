package ejercicio_1;

public class Ejercicio_1_lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
