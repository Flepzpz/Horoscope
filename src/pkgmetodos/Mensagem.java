package pkgmetodos;

import pkgmetodos.Definesigno;
import pkgmetodos.Frases;

public class Mensagem {
	
	public static String mensagem;
	
	public static void horoscopo() {
		
		switch (Definesigno.signo) {
		
		case "Capricórnio":
			Frases.capricornio();
			break;
			
		case "Aquário":
			Frases.aquario();
			break;
			
		case "Peixes":
			Frases.pexe();
			break;
			
		case "Áries":
			Frases.aries();
			break;
			
		case "Touro":
			Frases.touro();
			break;
			
		case "Gêmeos":
			Frases.gemeos();
			break;
			
		case "Câncer":
			Frases.cancer();
			break;
			
		case "Leão":
			Frases.leao();
			break;
			
		case "Virgem":
			Frases.virgem();
			break;
			
		case "Libra":
			Frases.libra();
			break;
			
		case "Escorpião":
			Frases.escorpiao();
			break;
			
		case "Sagitário":
			Frases.sagitario();
			break;
		
		
		}
		
	}
	

}
