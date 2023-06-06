package pkgmetodos;
	

	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.SwingConstants;

	import java.awt.BorderLayout;
	import java.awt.Dialog.ModalityType;
	import java.awt.Font;

	import javax.swing.ImageIcon;
	import javax.swing.JDialog;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	public class Joption {


	public static void pergSimples() {
		String resposta = JOptionPane.showInputDialog("Qual o seu nome?");
	    System.out.println(resposta);
	}

	public static void pergSugestao() {
		String resposta = JOptionPane.showInputDialog("Qual o seu nome?", "Ana Júlia");
	    System.out.println(resposta);

	}

	public static void dropDownString() {

		  Integer[] options = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	      ImageIcon icon = new ImageIcon("src/images/teste4.jpg");
	      int n = (int)JOptionPane.showInputDialog(null, "Selecione o dia do seu nascimento:", 
	              "Dia", JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
	      System.out.println(n);

	}

	public static void exemploClick() {
		  Object[] options = {"Opção 1", "Opção 2", "Opção 3"};
	      
	      int selectedOption = JOptionPane.showOptionDialog(null,
	              "Selecione uma opção",
	              "JOptionPane com opções clicáveis",
	              JOptionPane.DEFAULT_OPTION,
	              JOptionPane.INFORMATION_MESSAGE,
	              null,
	              options,
	              options[0]);
	      
	      // Verificar qual opção foi selecionada
	      if (selectedOption == 0) {
	          JOptionPane.showMessageDialog(null, "Você selecionou a Opção 1");
	      } else if (selectedOption == 1) {
	          JOptionPane.showMessageDialog(null, "Você selecionou a Opção 2");
	      } else if (selectedOption == 2) {
	          JOptionPane.showMessageDialog(null, "Você selecionou a Opção 3");
	      }

	}

	public static void avisos() {
		JOptionPane.showMessageDialog(null, "Este é um aviso!", "Aviso", JOptionPane.WARNING_MESSAGE);

	}


	public static void tela() {
	    JDialog dialog = new JDialog();
	    dialog.setModalityType(ModalityType.APPLICATION_MODAL);
	    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	    String mensagem = "Bem-vindo à minha aplicação!";
	    JPanel panel = new JPanel(new BorderLayout());
	    JLabel label = new JLabel(mensagem, SwingConstants.CENTER);
	    label.setFont(new Font("Arial", Font.BOLD, 12));
	    panel.add(label, BorderLayout.CENTER);
	    
	    dialog.getContentPane().add(panel);
	    dialog.setSize(300, 200);
	    dialog.setLocationRelativeTo(null);
	    dialog.setVisible(true);
	}
		/*public static void main(String[] args) {
	        //Pergunta simples
			//pergSimples();
			
			//Pergunta com sugestão
			//pergSugestao();
			
			//Drop Down com imagem
			//dropDownString();
			
			//Tela com botões Clicáveis
			//exemploClick();
			
			//Avisos
			//avisos();
			
			//Tela JFRAME
			//tela();
		}*/

	}


