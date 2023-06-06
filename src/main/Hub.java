package main;

import pkgmetodos.Definesigno;
import pkgmetodos.Mensagem;
import javax.swing.JOptionPane;

public class Hub {

	public static void main(String[] args) {

		Definesigno.signos();
		JOptionPane.showMessageDialog(null, "Seu signo é "+Definesigno.signo);
		Mensagem.horoscopo();

	}

}
