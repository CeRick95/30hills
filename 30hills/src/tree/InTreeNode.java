package tree;

import javax.swing.tree.DefaultMutableTreeNode;

import model.InformationResources;

public class InTreeNode extends DefaultMutableTreeNode{
	
	private String name;
	private InformationResources resurs;
	
	public InTreeNode(String name,InformationResources d){
		this.name=name;
		this.resurs=d;
	}
	

	public InformationResources getResurs() {
		return resurs;
	}

	@Override
	public String toString() {
		return name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
