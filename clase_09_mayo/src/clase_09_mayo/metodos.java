package clase_09_mayo;

import javax.swing.JOptionPane;

public class metodos {
	int a,b; //atributos

	public metodos(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}
//con el set pasamos como parametro a la variable que tenemos en la clase main
	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public static int producto(int x,int y) {
		int pro=x*y;
		return pro;
	}
	public void saludo() {
		JOptionPane.showMessageDialog(null,"saludos");
	}
	public void adios() {
		JOptionPane.showMessageDialog(null,"Chao,muak");
	}
}
