package practico_1;

import java.util.Iterator;

public class IteradorLista<T> implements Iterator<T> {

	private Node<T> cursor;

	public IteradorLista(Node<T> cursor) {
		this.cursor=cursor;
	}
	@Override
	public boolean hasNext() {
		return this.cursor!=null;
	}
	@Override
	public T next() {
		T valor = cursor.getInfo();
		cursor = cursor.getNext();
		return valor;
	}
	public T valorSiguiente() {
		T valor = cursor.getNext().getInfo();
		return valor;
	}
	public T valor() {
		T valor = cursor.getInfo();
		return valor;
	}
	
	
}
