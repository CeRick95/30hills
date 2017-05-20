package controller;

public class ActionManager {
	
	private TreeAction treeaction;
	private static ActionManager instance=null;
	private HelpAction helpaction;
	
	public ActionManager() {
		initactions();
	}
	
	private void initactions() {
		treeaction=new TreeAction();
		helpaction=new HelpAction();
		
	}

	public TreeAction getTreeaction() {
		return treeaction;
	}
	public void setTreeaction(TreeAction treeaction) {
		this.treeaction = treeaction;
	}
	public static ActionManager getInstance() {
		if(instance==null){
			instance=new ActionManager();
		}
		return instance;
	}
	public static void setInstance(ActionManager instance) {
		ActionManager.instance = instance;
	}

	public HelpAction getHelpaction() {
		return helpaction;
	}

	public void setHelpaction(HelpAction helpaction) {
		this.helpaction = helpaction;
	}
	
	

}
