package clase_09_mayo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		metodos a = new metodos(0, 0);
		int x,y;
		x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero:"));
		
		y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero:"));
		
		
		
		
		
		JOptionPane.showMessageDialog(null,"El resultado es : "+a.producto(x, y));
		a.adios();
		scan.close();
	}

}
