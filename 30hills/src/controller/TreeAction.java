package controller;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.tree.TreePath;

import app.AppCore;
import model.InformationResources;
import model.User;
import tree.InTreeNode;
import tree.InfTree;
import view.UserDetails;

public class TreeAction implements MouseListener{
	private UserDetails details=new UserDetails();
	private List<User> users=User.getUsers();
	@Override
	public void mouseClicked(MouseEvent e) {
		InfTree tree=(InfTree)e.getSource();
		TreePath path=tree.getPathForLocation(e.getX(), e.getY());
		
		if(path==null) return;
		
		if(e.getClickCount()%2==0){
			InTreeNode selectedNode=(InTreeNode)path.getLastPathComponent();
			if(selectedNode.getName().equalsIgnoreCase("Friends")) return;
			InformationResources resurs=selectedNode.getResurs();
			if(resurs instanceof User){
				User u=(User)resurs;
				details.getId_lb().setText("ID: "+u.getId());
				details.getFirstname_lb().setText("First name: "+ u.getFirstName());
				details.getSurname_lb().setText("Surname: "+u.getSurname());
				details.getAge_lb().setText("Age: "+u.getAge());
				details.getGender_lb().setText("Gender: "+u.getGender());
			    DefaultListModel<User> listmodel=new DefaultListModel<>();
			    DefaultListModel<User> listfriends=new DefaultListModel<>();
			    DefaultListModel<User> listsugg=new DefaultListModel<>();
			    List<User> userf=new ArrayList<>();
				
			    
			    for(User u1 : users){
					for(int i=0; i<u.getFriends().size(); i++){
					if(u1.getId()==u.getFriends().get(i)){
						listmodel.addElement(u1);
						userf.add(u1);
					}
					}
				}
				
				for (int i = 0; i <userf.size(); i++) {
					User u2=userf.get(i);
					for (int j = 0; j < u2.getFriends().size(); j++) {
						for(User u3 : users){
							if(u3.getId()==u2.getFriends().get(j)){
								if(listfriends.contains(u3)) continue;
								listfriends.addElement(u3);
							}
						}
					}
				}
				
				for (int i = 0; i < listfriends.getSize(); i++) {
					if(listfriends.getElementAt(i).getId()==u.getId()){
						listfriends.removeElementAt(i);
					}
				}
				
				for (int i = 0; i < listfriends.getSize(); i++) {
					User u4=listfriends.getElementAt(i);
					for(User u5 : users){
						if(listsugg.contains(u5)) continue;
						if(u4.getFriends().contains(u.getId())) continue;
						if(u4.getFriends().contains(u5.getId())) listsugg.addElement(u5);
					}
				}
				
				for (int i = 0; i < listsugg.getSize(); i++) {
					if(listmodel.contains(listsugg.getElementAt(i))) listsugg.removeElementAt(i);
				}
				
				details.getList().setModel(listmodel);
				details.getListfriends().setModel(listfriends);
				details.getListsugges().setModel(listsugg);
				AppCore.getInstance().getMain().add(details,BorderLayout.CENTER);
				AppCore.getInstance().getMain().revalidate();
				AppCore.getInstance().getMain().repaint();
			}
		}
		
	}
	

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
