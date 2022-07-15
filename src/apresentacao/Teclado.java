package apresentacao;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teclado extends JPanel implements ActionListener {

	private Display display;
	
	JLabel labelPessoa = new JLabel("Pessoa:");
	JLabel labelCarro = new JLabel("Carro:");
	JLabel labelCep = new JLabel("CEP:");
	JLabel labelFruta = new JLabel("Fruta");
	JLabel labelObjeto = new JLabel("Objeto");
	JLabel labelAnimal = new JLabel("Animal");
	
	
	public Teclado() {
		
		setLayout(new GridLayout(6,1));
		
		add(labelPessoa);
		add(criarTexto("",5));
		add(labelCarro);
		add(criarTexto("",5));
		
		add(labelCep);
		add(criarTexto("",5));
		add(labelFruta);
		add(criarTexto("",5));
		
		add(labelObjeto);
		add(criarTexto("",5));
		add(labelAnimal);
		add(criarTexto("",5));
		
	}

	public JTextField criarTexto(String texto, int tamanho) {
		JTextField t = new JTextField(null,texto,tamanho);
		return t;
	}

	public void actionPerformed(ActionEvent e) {
		
		
	}

}
