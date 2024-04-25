package practico_3;

public class TreeNode {


	private Integer value;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(Integer value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public TreeNode getLeft() {
		return left;
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public Integer getValue() {
		return value;
	}
	
	public boolean remove(int value, TreeNode parent) {
	    if (value < this.value) {
	        if (left != null)
	            return left.remove(value, this);
	        else
	            return false;
	    } else if (value > this.value) {
	        if (right != null)
	            return right.remove(value, this);
	        else
	            return false;
	    } else {
	        if (left != null && right != null) {
	            this.value = right.NMI();
	            right.remove(this.value, this);
	        } else if (parent.getLeft() == this) {
	        	if(left!=null) {
	        		 parent.setLeft(left);
	        	}
	        	else {
	        		 parent.setLeft(right);
	        	}
	  
	        } else if (parent.getRight() == this) {
	        	if(left!=null) {
	        		 parent.setRight(left);
	        	}
	        	else {
	        		 parent.setRight(right);
	        	}
	        }
	        return true;
	    }
	}
	//Nodo mas izquierdo
	public int NMI() {
	    if (left == null)
	        return value;
	    else
	        return left.NMI();
	}
	
	//Nodo mas derecho
	
	public int NMD() {
		if(right ==null) 
			return value;
		else 
			return right.NMD();
	}
}
