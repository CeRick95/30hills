package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import controller.ActionManager;
import controller.SchemeAction;
import model.User;
import tree.InfTree;

public class MainFrame extends JFrame{
	
	
	private InfTree tree;
	private User user=null;
	private JMenuBar menu;
	
	public MainFrame() throws JsonParseException, JsonMappingException, IOException{
		setSize(500,500);
		setLocationRelativeTo(null);
		setTitle("30hills");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initCom();
		revalidate();
		repaint();
	}

	private void initCom() throws JsonParseException, JsonMappingException, IOException {
		JPanel west=new JPanel();
		user=SchemeAction.MakeObject("src/resources/data.json");
		menu=new JMenuBar();
		JMenu About=new JMenu("About");
		JMenuItem help=new JMenuItem("Help");
		help.addActionListener(ActionManager.getInstance().getHelpaction());
		About.add(help);
		menu.add(About);
		InfTree tree=new InfTree(user);
		west.add(new JScrollPane(tree));		
		add(west,BorderLayout.WEST);
		add(menu,BorderLayout.NORTH);
	}
	

}
