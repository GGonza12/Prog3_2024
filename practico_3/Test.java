package practico_3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree a1 = new Tree();
		
		a1.add(2);
		a1.add(3);
		a1.add(8);
		a1.add(5);
		a1.add(7);
		a1.add(4);
		a1.imprimirPreOrden();
		System.out.println('-');
		a1.imprimirPosOrden();
		System.out.println('-');
		a1.imprimirEnOrden();
		System.out.println('-');
		System.out.println(a1.getHeight());
		
		System.out.println(a1.getLongestBranch());
		System.out.println(a1.getFrontera());
		System.out.println(a1.getElemAtLevel(1));
		System.out.println(a1.getMaxElem());
		System.out.println(a1.getSumOfValues());
		
		System.out.println(a1.getValuesGreaterThan(7));
	
		a1.imprimirPreOrden();
	}

}
