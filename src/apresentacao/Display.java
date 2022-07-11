package apresentacao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel {
	
	private JLabel label;
	
	public Display(String nome) {
		label = new JLabel();
		label.setText(nome);
		label.setBackground(Color.WHITE);
		label.setFont(new Font("arial",Font.BOLD,40));
		add(label);
	}

}
