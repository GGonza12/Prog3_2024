package practico_3;

import java.util.ArrayList;
import java.util.List;

public class Tree {

private TreeNode root;

	public Tree() {
		this.root = null;
	}
	
	public void add(Integer value) {
		if (this.root == null) {
			this.root = new TreeNode(value);
		}
		else {
			this.add(this.root,value);
		}
	}
	
	private void add(TreeNode actual, Integer value) {
		if (actual.getValue() > value) {
			if (actual.getLeft() == null) { 
				TreeNode temp = new TreeNode(value);
				actual.setLeft(temp);
			} else {
				add(actual.getLeft(),value);
		
			}
		} else if (actual.getValue() < value) {
			if (actual.getRight() == null) { 
				TreeNode temp = new TreeNode(value);
				actual.setRight(temp);
			} else {
				add(actual.getRight(),value);
			}
		}
		
	}
	
	public int getRoot() {
		return this.root.getValue();
	}
	
	public boolean hasElem(Integer a) {
		return false;
	}
	
	public boolean isEmpty() {
		return  this.root.getValue()==null;
	}
	
	public boolean esHoja(TreeNode nodo) {
		return nodo.getLeft() == null && nodo.getRight()==null;
	}
	
	public boolean esNodoInterno(TreeNode nodo) {
		return !esHoja(nodo);
	}
	
	public int getHeight() {
		return this.getHeight(this.root);
	}
	
	private int getHeight(TreeNode nodo) {
		int altura =0;
		
		if(esNodoInterno(nodo)) {
			if(nodo.getLeft()!=null) {
				altura = Math.max(altura,getHeight(nodo.getLeft()));
			}
			if(nodo.getRight()!=null) {
				altura = Math.max(altura,getHeight(nodo.getRight()));
			}
			altura++;
		}
		return altura;
	}
	
	private void imprimirPreOrden(TreeNode nodo)
	{
	if (nodo == null) {
		//System.out.println('-');
		return;
	}

	System.out.print(nodo.getValue() + " ");
	imprimirPreOrden(nodo.getLeft());
	imprimirPreOrden(nodo.getRight());
	
	}
	
	private void imprimirPosOrden(TreeNode nodo) {
			if (nodo == null) {
				//System.out.println('-');
				return;
			}
			imprimirPreOrden(nodo.getLeft());
			imprimirPreOrden(nodo.getRight());
			System.out.print(nodo.getValue() + " ");	
	}
	
	private void imprimirEnOrden(TreeNode nodo) {
		if (nodo == null) {
			//System.out.println('-');
			return;
		}
		imprimirPreOrden(nodo.getLeft());
		System.out.print(nodo.getValue() + " ");
		imprimirPreOrden(nodo.getRight());
	
	}
	
	public void imprimirPreOrden() {
		imprimirPreOrden(this.root);
	}
	
	public void imprimirPosOrden() {
		imprimirPosOrden(this.root);
	}
	
	public void imprimirEnOrden() {
		imprimirEnOrden(this.root);
	}
	
	
	public boolean delete(int value) {
	    if (root == null)
	        return false;
	    else {
	        if (root.getValue() == value) {
	            TreeNode auxRoot = new TreeNode(0);
	            auxRoot.setLeft(root);
	            boolean result = root.remove(value, auxRoot);
	            root = auxRoot.getLeft();
	            return result;
	        } else {
	            return root.remove(value, null);
	        }
	    }
	}
	
	public List<Integer> getLongestBranch() {
	    List<Integer> longestBranch = new ArrayList<>();
	    getLongestBranch(this.root, new ArrayList<>(), longestBranch);
	    return longestBranch;
	}


	private void getLongestBranch(TreeNode node, List<Integer> currentBranch, List<Integer> longestBranch) {
	    if (node == null) {
	        if (currentBranch.size() > longestBranch.size()) {
	            longestBranch.clear();
	            longestBranch.addAll(currentBranch);
	        }
	    } else {
	        currentBranch.add(node.getValue());  // Agrega el valor del nodo actual a la rama actual
	        getLongestBranch(node.getLeft(), currentBranch, longestBranch);  // Llamada recursiva al hijo izquierdo
	        getLongestBranch(node.getRight(), currentBranch, longestBranch);  // Llamada recursiva al hijo derecho
	        currentBranch.remove(currentBranch.size() - 1);  // Elimina el nodo actual de la rama actual después de explorar sus hijos
	    }
	}
	
	  public List<Integer> getFrontera() {
	        List<Integer> frontera = new ArrayList<>();
	        getFrontera(this.root, frontera);
	        return frontera;
	    }

	    private void getFrontera(TreeNode node, List<Integer> leafNodes) {
	        if (node == null) {
	            return;
	        }

	        if (node.getLeft() == null && node.getRight() == null) {
	            leafNodes.add(node.getValue());
	        } else {
	        	getFrontera(node.getLeft(), leafNodes);
	        	getFrontera(node.getRight(), leafNodes);
	        }
	    }
	    
	    public List<Integer> getElemAtLevel(int level) {
	        List<Integer> nodesAtLevel = new ArrayList<>();
	        getElemAtLevel(this.root, nodesAtLevel, 0, level);
	        return nodesAtLevel;
	    }

	    private void getElemAtLevel(TreeNode node, List<Integer> nodesAtLevel, int currentLevel, int targetLevel) {
	        if (node == null) {
	            return;
	        }

	        if (currentLevel == targetLevel) {
	            nodesAtLevel.add(node.getValue());
	        } else {
	        	getElemAtLevel(node.getLeft(), nodesAtLevel, currentLevel + 1, targetLevel);
	        	getElemAtLevel(node.getRight(), nodesAtLevel, currentLevel + 1, targetLevel);
	        }
	    }
	    
	   public Integer getMaxElem() {
	    	int maxElem = this.root.NMD();
	    	return maxElem;
	    }
	   
	   public int getSumOfValues() {
	        return getSumOfValues(this.root);
	    }

	    private int getSumOfValues(TreeNode node) {
	        if (node == null) {
	            return 0;
	        }

	        int sum = node.getValue();
	        sum += getSumOfValues(node.getLeft());
	        sum += getSumOfValues(node.getRight());
	        return sum;
	    }
	    
	    public List<Integer> getValuesGreaterThan(int targetValue) {
	        List<Integer> valuesGreaterThanTarget = new ArrayList<>();
	        getValuesGreaterThan(this.root, valuesGreaterThanTarget, targetValue);
	        return valuesGreaterThanTarget;
	    }

	    private void getValuesGreaterThan(TreeNode node, List<Integer> valuesGreaterThanTarget, int targetValue) {
	        if (node == null) {
	            return;
	        }

	        if (node.getValue() > targetValue) {
	            valuesGreaterThanTarget.add(node.getValue());
	        }

	        getValuesGreaterThan(node.getLeft(), valuesGreaterThanTarget, targetValue);
	        getValuesGreaterThan(node.getRight(), valuesGreaterThanTarget, targetValue);
	    }
	    

	


	
}
