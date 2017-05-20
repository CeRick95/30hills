package app;

import java.io.IOException;

import view.MainFrame;

public class AppCore {
	
	private static AppCore instance=null;
	private MainFrame main;
	
	public AppCore() {
		try {
			main=new MainFrame();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static AppCore getInstance() {
		if(instance==null){
			instance=new AppCore();
		}
		return instance;
	}
	public static void setInstance(AppCore instance) {
		AppCore.instance = instance;
	}
	public MainFrame getMain() {
		return main;
	}
	public void setMain(MainFrame main) {
		this.main = main;
	}
	
	

}
