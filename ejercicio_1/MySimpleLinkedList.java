package ejercicio_1;

import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<T> {

	private int size;
	private Node<T> first;
	
	public MySimpleLinkedList() {
		this.first = null;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size = this.size +1;
		
	}
	
	public T extractFront() {		
		
		return this.first.getInfo();
	}

	public boolean isEmpty() {
		
		return this.first.getInfo() == null;
	}
	
	public T get(int index) {
		int contador=0;
		Node<T> aux = this.first;
		
		while((aux!=null)&&(contador<index)) {
			contador = contador+1;
			aux = aux.getNext();	
		}
		
		return aux.getInfo();
	}
	
	public void deleteNode(int index) {
		int contador=0;
		Node<T> anterior = null;
		Node<T> aux = this.first;
		while((aux!=null)&&(contador<index)) {
			if(contador==index-1) {
				anterior = aux;
			}
			contador = contador+1;
			aux = aux.getNext();
		}
		if(contador==index) {
			anterior.setNext(aux.getNext());
		}
		
		
	}
	
	public int indexOf(T info) {
		boolean encontrado = false;
		Node<T> aux = this.first;
		int pos = 0;
		
		while((aux.getNext()!=null)&&(encontrado==false)) {
			if(aux.getInfo()==info) {
				encontrado = true;
			}
			else {
				aux = aux.getNext();	
				pos= pos+1;
				
			}
		}
		if (aux.getInfo()!=info) {
			return -1;
		}
		return pos;
	}
	
	public void insertOrdered(T info ) {
		
	}
	
	public void ordernarListasComun(MySimpleLinkedList<T> l1,MySimpleLinkedList<T> l2) {
		
	int pos1=0;
	int pos2=0;
	Node<T> aux1 =null;
	aux1.setInfo(l1.extractFront());
	Node<T> aux2 =null;
	aux2.setInfo(l2.extractFront());
		while(aux1.getNext()!=null) {
			
			if(aux1.getInfo()==aux2.getInfo()) {
				
			}
			
			pos1++;
		
			while(false) {
				
			}
		}
		
	}

	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		// TODO
		return "Lista_vinculada [primero=" + this.first + "]";
	}

	@Override
	public Iterator<T> iterator() {
		return new IteradorLista<T>(this.first);
	}

}
