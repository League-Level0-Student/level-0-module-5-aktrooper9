package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	String num =JOptionPane.showInputDialog("name a number any number");
	int n = Integer.parseInt(num);
	for(int i = 2;i<n;i++) {
		if(n%i==0) {
			JOptionPane.showMessageDialog(null, "Your number is not prime");
			System.exit(0);
		}
		
	}
	JOptionPane.showMessageDialog(null, "Your number is prime");
}
}