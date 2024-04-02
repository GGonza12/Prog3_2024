package ejercicio_1;
import java.util.Comparator;
import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<T> {

	private int size;
	private Node<T> first;
	private Comparator<T> comp;
	
	public MySimpleLinkedList(Comparator<T> comp) {
		this.first = null;
		this.comp= comp;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size = this.size +1;
		
	}
	
	public T extractFront() {		
		Node<T> tmp = new Node<T>(this.first.getInfo(),null);
		this.first = this.first.getNext();
		return tmp.getInfo();
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
	
	public Node<T> getFirst() {
		return this.first;
	}
	
	
	
	public MySimpleLinkedList<T> ordernarListasComun(MySimpleLinkedList<T> l1,MySimpleLinkedList<T> l2) {
		
		Node<T> aux1 =new Node<T>();;
		aux1 = (l1.getFirst());
		Node<T> aux2 = new Node<T>();
		aux2=(l2.getFirst());
		MySimpleLinkedList<T> listaOrdenada = new MySimpleLinkedList<T>(this.comp);
			while(aux1.getNext()!=null) {
			
				while((aux2.getNext()!=null)&&((comp.compare(aux1.getInfo(), aux2.getInfo())!=0))) {
	
						aux2 = aux2.getNext();
						
					}
				
				if(comp.compare(aux1.getInfo(), aux2.getInfo())==0) {

					listaOrdenada.insertarOrdenado(aux2.getInfo());
				}
				
				aux1 = aux1.getNext();
				
				aux2=(l2.getFirst());
			}
			
			if (aux1.getNext()==null) {
				while((aux2.getNext()!=null)&&((comp.compare(aux1.getInfo(), aux2.getInfo())!=0))) {
					
					aux2 = aux2.getNext();
					
				}
			
			if(comp.compare(aux1.getInfo(), aux2.getInfo())==0) {

				listaOrdenada.insertarOrdenado(aux2.getInfo());
			}
			}
			
			return listaOrdenada;
			
		
	}
	public void insertarOrdenado(T dato) {
		Node<T> nuevo = new Node<T>();
		nuevo.setInfo(dato);
		if(this.first==null) {
			this.first = nuevo;
		}
		else {
			Node<T> anterior = null;
			Node<T> aux = this.first;	
			while((aux!=null)&&(comp.compare(dato, aux.getInfo())<0)){
				anterior = aux;
				aux = aux.getNext();
			}
			if(anterior!=null && aux==null) {
				anterior.setNext(nuevo);
			}
			else {
				nuevo.setNext(aux);
				if(aux == this.first) {
					this.first = nuevo;
				}
				else {
					anterior.setNext(nuevo);
				}
			}
		}
		this.size++;
	}
	
public MySimpleLinkedList<T> ordernarListasPrimera(MySimpleLinkedList<T> l1,MySimpleLinkedList<T> l2) {
		
		Node<T> aux1 =new Node<T>();;
		aux1 = (l1.getFirst());
		Node<T> aux2 = new Node<T>();
		aux2=(l2.getFirst());
		MySimpleLinkedList<T> listaOrdenada = new MySimpleLinkedList<T>(this.comp);
		boolean encontrado = false;
	
			while(aux1.getNext()!=null) {
			
				while((aux2.getNext()!=null)&&(encontrado!=true)) {
						if((comp.compare(aux1.getInfo(), aux2.getInfo())==0)) {
							encontrado= true;
						}
						aux2 = aux2.getNext();
						
					}
				
				if((encontrado!=true)) {
					listaOrdenada.insertarOrdenado(aux1.getInfo());
				}
				
				aux1 = aux1.getNext();
				
				aux2=(l2.getFirst());
			encontrado=false;
			}
			
			return listaOrdenada;
			
		
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
