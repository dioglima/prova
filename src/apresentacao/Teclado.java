package apresentacao;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Teclado extends JPanel {

	private Display display;
	
	JLabel labelPessoa = new JLabel("Pessoa:");
	JLabel labelCarro = new JLabel("Carro:");
	JLabel labelCep = new JLabel("CEP:");
	JLabel labelFruta = new JLabel("Fruta");
	JLabel labelObjeto = new JLabel("Objeto");
	JLabel labelAnimal = new JLabel("Animal");
	
	
	public Teclado() {
		
		setLayout(new GridLayout(3,4));
		
		add(labelPessoa);
		add(new JTextField(null,"",10));
		add(labelCarro);
		add(new JTextField(null,"",5));
		
		add(labelCep);
		add(new JTextField(null,"",5));
		add(labelFruta);
		add(new JTextField(null,"",5));
		
		add(labelObjeto);
		add(new JTextField(null,"",5));
		add(labelAnimal);
		add(new JTextField(null,"",5));
		
	}

}
