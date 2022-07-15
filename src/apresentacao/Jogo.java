package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import negocio.Participante;


public class Jogo extends JFrame {
	
	Participante participante = new Participante();

	

	public Jogo() {
		organizador();
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
	public void organizador() {
		
		setLayout(new BorderLayout());
		Display display1 = new Display(participante.getNome());
//		Display display2 = new Display("Final");
		Teclado teclado = new Teclado();
		Botao botao = new Botao("Próxima Letra",Color.WHITE);
		
		display1.setPreferredSize(new Dimension(100,100));
		
		add(display1,BorderLayout.NORTH);
		add(teclado,BorderLayout.CENTER);
		add(botao,BorderLayout.SOUTH);
	}
	
}

