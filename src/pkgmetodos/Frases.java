package pkgmetodos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import pkgmetodos.rand;

public class Frases {
	
	public static void aquario() {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Aquário é independente e valoriza sua liberdade e individualidade.");
        frases.add("Aquário é humanitário e preocupado com o bem-estar da sociedade como um todo.");
        frases.add("Aquário é idealista e luta por causas sociais e pela igualdade.");
        frases.add("Aquário é amigável e gosta de se envolver em grupos e comunidades.");
        frases.add("Aquário é visionário e tem uma visão ampla e futurista.");

        JOptionPane.showMessageDialog(null, frases.get(rand.d5()));

    	}
	
	
	 public static void aries() {



	        ArrayList<String> caracteristica = new ArrayList<String>();
	        caracteristica.add("impulsionar");
	        caracteristica.add("desbravar");
	        caracteristica.add("aventurar-se");
	        caracteristica.add("iniciar");
	        caracteristica.add("liderar");


	        ArrayList<String> caracteristica2 = new ArrayList<String>();
	        caracteristica2.add("empreender");
	        caracteristica2.add("correr riscos");
	        caracteristica2.add("ser independente");
	        caracteristica2.add("ser determinado");
	        caracteristica2.add("ser ousado");


	        ArrayList<String> fraseRand = new ArrayList<String>();
	        fraseRand.add(" Os arianos são dotados de uma energia inesgotável, o que os impulsiona a " + caracteristica.get(rand.d5()) + " e " +  caracteristica2.get(rand.d5()) + ", buscando constantemente novos desafios para superar.");
	        fraseRand.add(" A personalidade ariana é marcada por uma coragem intrépida, que os leva a " + caracteristica.get(rand.d5()) + " sem hesitação, enfrentando qualquer obstáculo que surja em seu caminho.");
	        fraseRand.add(" Arianos são líderes natos, capazes de " + caracteristica2.get(rand.d5()) + " com uma determinação feroz e inspirar aqueles ao seu redor a alcançarem seu potencial máximo.");
	        fraseRand.add(" Os arianos são apaixonados por " + caracteristica.get(rand.d5())  + " em novos projetos e colocar seu coração e alma em tudo o que fazem.");
	        fraseRand.add(" Arianos adoram " + caracteristica2.get(rand.d5()) + " novos desafios e superar obstáculos que surgem em seu caminho.");

	        JOptionPane.showMessageDialog(null, fraseRand.get(rand.d5()));

	    }
	 
	 
	 public static void cancer() {

	        ArrayList<String> frases = new ArrayList<>();
	        frases.add("Cancerianos são emocionais e sensíveis, têm um grande coração.");
	        frases.add("Cancerianos são protetores e se importam profundamente com seus entes queridos.");
	        frases.add("Cancerianos são leais e valorizam muito a família e os amigos próximos.");
	        frases.add("Cancerianos são intuitivos e confiam em sua intuição para tomar decisões.");
	        frases.add("Cancerianos são cuidadosos e atenciosos, sempre se preocupam com o bem-estar dos outros.");

	        JOptionPane.showMessageDialog(null, frases.get(rand.d5()));

	    }
	 
	 
	 public static void capricornio() {
	        ArrayList<String> frases = new ArrayList<>();
	        frases.add("Capricórnio é ambicioso e determinado, sempre buscando alcancar o sucesso.");
	        frases.add("Capricórnio é responsável e confiável, cumprindo com suas obrigações e compromissos.");
	        frases.add("Capricórnio é disciplinado e organizado, tendo uma abordagem estruturada para a vida.");
	        frases.add("Capricórnio é ambicioso e trabalha duro para alcancar suas metas.");
	        frases.add("Capricórnio é prudente com o dinheiro e valoriza a estabilidade financeira.");

	        JOptionPane.showMessageDialog(null, frases.get(rand.d5()));
	        
	    }
	 
	 
	 public static void escorpiao() {
	        ArrayList<String> frases = new ArrayList<>();
	        frases.add("Escorpião é intenso e apaixonado em tudo o que faz.");
	        frases.add("Escorpião é determinado e obstinado, não desiste facilmente de seus objetivos.");
	        frases.add("Escorpião é corajoso e enfrenta os desafios de frente, sem medo.");
	        frases.add("Escorpião é um investigador nato, sempre em busca de descobrir a verdade.");
	        frases.add("Escorpião é resiliente e é capaz de se recuperar de qualquer adversidade.");

	        JOptionPane.showMessageDialog(null, frases.get(rand.d5()));

	    }
	 
	 
	 public static void gemeos() {

	        ArrayList<String> frases =new ArrayList<>();
	        frases.add("Gêmeos são comunicativos e adoram conversar, são mestres na arte da conversa.");
	        frases.add("Gêmeos são curiosos e estão sempre em busca de novos conhecimentos e experiências");
	        frases.add("Gêmeos são versáteis e adaptáveis, conseguem se ajustar facilmente a diferentes situações.");
	        frases.add("Gêmeos são sociáveis e têm uma grande facilidade em fazer amigos.");
	        frases.add("Gêmeos são inquietos e estão sempre em movimento, gostam de variar e experimentar coisas novas");

	        JOptionPane.showMessageDialog(null, frases.get(rand.d5()));

	    }
	 
	 
	 public static void leao() {
	        ArrayList<String> frases = new ArrayList<>();
	        frases.add("Leão é o rei da selva zodiacal, confiante e cheio de autoridade.");
	        frases.add("Leão adora estar no centro das atenções e tem uma personalidade carismática.");
	        frases.add("Leão é generoso e gosta de compartilhar seu sucesso com os outros.");
	        frases.add("Leão adora o luxo e o glamour, aprecia os prazeres da vida");
	        frases.add("Leão é corajoso e destemido, enfrenta desafios com confiança e determinação.");

	        JOptionPane.showMessageDialog(null, frases.get(rand.d5()));

	    }
	 
	 
	 public static void libra() {
	        ArrayList<String> frases = new ArrayList<>();
	        frases.add("Libra é diplomático e busca o equilíbrio em todas as situações.");
	        frases.add("Libra é charmoso e tem uma personalidade encantadora que atrai as pessoas.");
	        frases.add("Libra é indeciso e pode ter dificuldade em tomar decisões.");
	        frases.add("Libra é amante da beleza e aprecia a arte e a estética.");
	        frases.add("Libra é gentil e preocupa-se com o bem-estar dos outros.");

	        JOptionPane.showMessageDialog(null, frases.get(rand.d5()));

	    }
	 
	 
	 public static void pexe(){
	        ArrayList<String> frases = new ArrayList<>();
	        frases.add("Peixes é intuitivo e possui uma forte conexão com o mundo emocional e espiritual.");
	        frases.add("Peixes é empático e sensível, capaz de se conectar profundamente com os sentimentos dos outros.");
	        frases.add("Peixes é idealista e busca um mundo de amor, compaixão e harmonia.");
	        frases.add("Peixes é emocionalmente profundo e pode sentir as energias ao seu redor de maneira intensa.");
	        frases.add("Peixes é sonhador e espiritual, buscando uma conexão maior com o universo.");

	        JOptionPane.showMessageDialog(null, frases.get(rand.d5()));

	    }
	 
	 
	 public static void sagitario(){
	        ArrayList<String> frases = new ArrayList<>();
	        frases.add("Sagitário é aventureiro e está sempre em busca de novas experiências e aventuras");
	        frases.add("Sagitário é otimista e possui uma visão positiva da vida.");
	        frases.add("Sagitário é sincero e direto, não tem medo de falar o que pensa.");
	        frases.add("Sagitário é intelectual e está sempre em busca de conhecimento e aprendizado.");
	        frases.add("Sagitário é entusiasta e contagia os outros com sua energia e paixão.");

	        JOptionPane.showMessageDialog(null, frases.get(rand.d5()));

	    }
	 
	 
	 public static void touro() {

	        ArrayList<String> caracteristica = new ArrayList<>();
	        caracteristica.add("desfrutar");
	        caracteristica.add("apreciar");
	        caracteristica.add("nutrir");
	        caracteristica.add("possuir");
	        caracteristica.add("resistir");

	        ArrayList<String> caracteristica2 = new ArrayList<>();
	        caracteristica2.add("preservar");
	        caracteristica2.add("saborear");
	        caracteristica2.add("relaxar");
	        caracteristica2.add("estabilizar");
	        caracteristica2.add("persistir");

	        ArrayList<String> frases = new ArrayList<>();
	        frases.add("Os taurinos são conhecidos por sua paciência inabalável, o que os capacita a " + caracteristica.get(rand.d5()) + " e " + caracteristica2.get(rand.d5()) + ", enfrentando obstáculos com determinação e mantendo uma perspectiva calma e equilibrada.");
	        frases.add("Lema dos taurinos: Devagar se vai longe, " + caracteristica.get(rand.d5()) + " e " + caracteristica2.get(rand.d5()));
	        frases.add("Taurinos são teimosos e obstinados, sempre querem ter razão, não desistem fácil dos seus objetivos");
	        frases.add("Taurinos são amantes do conforto e do luxo, sempre procuram viver bem.");
	        frases.add("Taurinos são trabalhadores e persistentes, não desistem facilmente.");


	        JOptionPane.showMessageDialog(null, frases.get(rand.d5()));

	    }
	 
	 
	 public static void virgem() {

	        ArrayList<String> frases = new ArrayList<>();
	        frases.add("Virgem é meticuloso e detalhista, prestando atenção aos mínimos detalhes.");
	        frases.add("Virgem é organizado e tem uma natureza perfeccionista, buscando a excelência em tudo o que faz.");
	        frases.add("Virgem é observador e possui uma mente analítica, sempre em busca de soluções e melhorias.");
	        frases.add("Virgem é confiável e responsável, cumprindo com suas obrigações e compromissos.");
	        frases.add("Virgem é cauteloso e preocupado com a saúde e o bem-estar, mantendo hábitos saudáveis.");

	        JOptionPane.showMessageDialog(null, frases.get(rand.d5()));

	    }

}
