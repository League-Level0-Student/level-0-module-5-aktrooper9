package _07_skill_practice;

import javax.swing.JOptionPane;

public class SKILL {

public static void main(String[] args) {
	String dimes= JOptionPane.showInputDialog("how many dimes fo you have");
	
int d = Integer.parseInt(dimes);
d= d*10;
JOptionPane.showMessageDialog(null, "you have "+d+" cents.");
}


}
























