package pkgmetodos;

import java.util.Scanner;
import pkgmetodos.Ascendente;

//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Definesigno {
	
	public static Scanner read = new Scanner(System.in);
	
	public static String signo;
	public static int month = 0,day,hora;
	
	
	public static void signos() {
		
		Integer[] days = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	    int day = (int)JOptionPane.showInputDialog(null, "Selecione o dia do seu nascimento:", 
	              "Dia", JOptionPane.QUESTION_MESSAGE, null, days, days[0]);
	      
	    Integer[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
	    int month = (int)JOptionPane.showInputDialog(null, "Selecione o mês do seu nascimento:", 
	              "Mês", JOptionPane.QUESTION_MESSAGE, null, months, months[0]);
	      
		
		switch(month) {
			
		case 1:
			if(day<21) {
				signo = "Capricórnio";
			} else {
				signo = "Aquário";
			}
			break;
			
		case 2:
			if(day<19) {
				signo = "Aquário";
			} else {
				signo = "Peixes";
			}
			break;
			
		case 3:
			if(day<21) {
				signo = "Peixes";
			} else {
				signo = "Áries";
			}
			break;
			
		case 4:
			if(day<21) {
				signo = "Áries";
			} else {
				signo = "Touro";
			}
			break;
			
		case 5:
			if(day<21) {
				signo = "Touro";
			} else {
				signo = "Gêmeos";
			}
			break;
			
		case 6:
			if(day<21) {
				signo = "Gêmeos";
			} else {
				signo = "Câncer";
			}
			break;
			
		case 7:
			if(day<23) {
				signo = "Câncer";
			} else {
				signo = "Leão";
			}
			break;
			
		case 8:
			if(day<23) {
				signo = "Leão";
			} else {
				signo = "Virgem";
			}
			
			break;
			
		case 9:
			if(day<23) {
				signo = "Virgem";
			} else {
				signo = "Libra";
			}
			break;
			
		case 10:
			if(day<23) {
				signo = "Libra";
			} else {
				signo = "Escorpião";
			}
			break;
			
		case 11:
			if(day<22) {
				signo = "Escorpião";
			} else {
				signo = "Sagitário";
			}
			break;
			
		case 12:
			if(day<22) {
				signo = "Sagitário";
			} else {
				signo = "Capricórnio";
			}
			break;
			
		}
		
		/*switch(signo) {
			
		case "Capricórnio":
			
		case "Aquário":
			
		case "Peixes":
			
		case "Áries":
			
		case "Touro":
			
		case "Gêmeos":
			
		case "Câncer":
			
		case "Leão":
			
		case "Virgem":
			
		case "Libra":
			
		case "Escorpião":
			
		case "Sagitário":
		
		}*/
		
		
	}
	
	
}
