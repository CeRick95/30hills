package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.User;

public class UserDetails extends JPanel {
	
	private JLabel Id_lb;
	private JLabel firstname_lb;
	private JLabel surname_lb;
	private JLabel age_lb;
	private JLabel gender_lb;
	private JPanel panelNorth;
	private JPanel panelCenter;
	private JList<User> list;
	private JList<User> listfriends;
	private JList<User> listsugges;
	
	public UserDetails() {
		initCom();
		setLayout(new BorderLayout());
		panelNorth.setLayout(new GridLayout(5, 1));
		panelNorth.add(Id_lb);
		panelNorth.add(firstname_lb);
		panelNorth.add(surname_lb);
		panelNorth.add(age_lb);
		panelNorth.add(gender_lb);
		panelCenter.add(new JScrollPane(list));
		panelCenter.add(new JScrollPane(listfriends));
		panelCenter.add(new JScrollPane(listsugges));
		add(panelNorth,BorderLayout.NORTH);
		add(panelCenter,BorderLayout.WEST);
	}

	private void initCom() {
		Id_lb=new JLabel();
		firstname_lb=new JLabel();
		surname_lb=new JLabel();
		age_lb=new JLabel();
		gender_lb=new JLabel(); 
		list=new JList<>();
		list.setPreferredSize(new Dimension(100, 100));
		listfriends=new JList<>();
		listfriends.setPreferredSize(new Dimension(100, 100));
		listsugges=new JList<>();
		listsugges.setPreferredSize(new Dimension(100, 100));
		panelNorth=new JPanel();
		panelCenter=new JPanel();
		
	}

	public JLabel getId_lb() {
		return Id_lb;
	}

	public void setId_lb(JLabel id_lb) {
		Id_lb = id_lb;
	}

	public JLabel getFirstname_lb() {
		return firstname_lb;
	}

	public void setFirstname_lb(JLabel firstname_lb) {
		this.firstname_lb = firstname_lb;
	}

	public JLabel getSurname_lb() {
		return surname_lb;
	}

	public void setSurname_lb(JLabel surname_lb) {
		this.surname_lb = surname_lb;
	}

	public JLabel getAge_lb() {
		return age_lb;
	}

	public void setAge_lb(JLabel age_lb) {
		this.age_lb = age_lb;
	}

	public JLabel getGender_lb() {
		return gender_lb;
	}

	public void setGender_lb(JLabel gender_lb) {
		this.gender_lb = gender_lb;
	}

	public JList<User> getList() {
		return list;
	}

	public void setList(JList<User> list) {
		this.list = list;
	}

	public JList<User> getListfriends() {
		return listfriends;
	}

	public void setListfriends(JList<User> listfriends) {
		this.listfriends = listfriends;
	}

	public JList<User> getListsugges() {
		return listsugges;
	}

	public void setListsugges(JList<User> listsugges) {
		this.listsugges = listsugges;
	}







	

}
