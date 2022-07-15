package apresentacao;

import negocio.Categorias;
import negocio.Letra;
import negocio.Participante;
import persistencia.CategoriasDAO;
import persistencia.LetraDAO;
import persistencia.ParticipanteDAO;

public class Main {

	public static void main(String[] args) {
	
		
		Participante p1 = new Participante();
		ParticipanteDAO dao = new ParticipanteDAO();
		Jogo jogo = new Jogo();
		Categorias c = new Categorias();
		CategoriasDAO cat = new CategoriasDAO(); 
		Letra l = new Letra();
		LetraDAO let = new LetraDAO();
	
		p1 = dao.listarPorId(5);
		
//		l.setLetra("a");
//		let.inserir(l);
//		l.setLetra("b");
//		let.inserir(l);
		
		System.out.println(let.listarPorId(1));
		System.out.println(let.listarPorId(2));
		
		
		//lista apena um participante por id
		System.out.println("id: "+ p1.getId() +
		" nome: "+ p1.getNome() +
		" pontuacao: "+ p1.getPontuacao());
		
		
		//lista todos os participantes
		for (Participante p : dao.listar()) {
			System.out.println("id: "+ p.getId() +
			" nome: "+ p.getNome() +
			" pontuacao: "+ p.getPontuacao());
		}

		//inserir um participante
		Participante p2 = new Participante();
		p2.setNome("Diogo");
		p2.setPontuacao(10);
				
//		if(dao.inserir(p2)) {
//			System.out.println("Cadatro realizado");
//		}else {
//			System.out.println("operaco nao realizada");
//		}
//		
		//listar todos os participantes
		for (int i =1;i<6;i++) {
			dao.listarPorId(i);
		}
		
		
		//deletar um participante
//		dao.deletar(6);
		
		System.out.println("Apos deletar");
		for (Participante p : dao.listar()) {
			System.out.println("id: "+ p.getId() +
			" nome: "+ p.getNome() +
			" pontuacao: "+ p.getPontuacao());
		}
		
		//atualizar um participante
		p2.setId(5);
		p2.setNome("Antonio");
		dao.update(p2);
		
		c.setAnimal("onça");
		c.setCarro("onibus");
		c.setCidadeEstadoPais("ouro preto");
		c.setFruta("ovo");
		c.setObjeto("olho");
		c.setParticipante(p2);
		c.setPessoa("otavio");
		
		cat.inserir(c);
		
	}

}
