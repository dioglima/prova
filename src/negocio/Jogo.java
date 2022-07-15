package negocio;

import persistencia.LetraDAO;

public class Jogo {

	LetraDAO let = new LetraDAO();
	Letra l = new Letra();
	
	public Letra pegarLetra() {
		return let.listarPorId(1);
	}
	
}
