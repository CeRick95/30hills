package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JTextArea;

import app.AppCore;

public class HelpAction extends AbstractAction {

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
	JDialog di = new JDialog(AppCore.getInstance().getMain(), "Help",null);
	di.setLocationRelativeTo(AppCore.getInstance().getMain());
	di.setSize(400, 400);
	di.setVisible(true);
	di.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	di.setResizable(false);
	JTextArea area=new JTextArea();
	area.setText("frist list is for directed friends, \n second friends of friends and last one is for suggested friends");
	area.setEnabled(false);
	di.add(area);	
	}
	
}
