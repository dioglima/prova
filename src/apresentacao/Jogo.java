package apresentacao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JFrame;

import negocio.Participante;

public class Jogo extends JFrame {
	
	Participante p = new Participante();

	public Jogo() {
		organizador();
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void organizador() {
		setLayout(new BorderLayout());
		Display display1 = new Display("Participante: ");
		Display display2 = new Display("Final");
		Teclado teclado = new Teclado();
		Botao botao = new Botao("Próxima Letra",Color.WHITE);
		
		display1.setPreferredSize(new Dimension(100,100));
		
		add(display1,BorderLayout.NORTH);
		add(teclado,BorderLayout.CENTER);
		add(botao,BorderLayout.SOUTH);
	}
	
}
