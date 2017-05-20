package tree;

import javax.swing.JTree;
import javax.swing.tree.TreePath;

import controller.ActionManager;
import model.User;

public class InfTree extends JTree {
	
	
	private InTreeNode root;
	private InTreeModel model;
	private InfTree tree;
	private User u;
	
	public InfTree(User u){
		this.u=u;
		tree=this;
		root=new InTreeNode("Friends", u);
		model=new InTreeModel(root);
		this.setModel(model);
		
		fillTree(u,root);
		
		this.expandPath(new TreePath(root));
		this.addMouseListener(ActionManager.getInstance().getTreeaction());
		
	}
	
	
	
	private  void fillTree(User u, InTreeNode r){
		if(u.getUsers()!=null){
			for(int i=0; i<u.getUsers().size(); i++){
				r.add(new InTreeNode(u.getUsers().get(i).getFirstName(), u.getUsers().get(i)));
			}
		}
	}
	
	 

}
