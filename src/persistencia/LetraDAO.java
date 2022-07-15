package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import negocio.Participante;
import negocio.Letra;

public class LetraDAO {
	
	public Letra listarPorId(int id) {

		Letra letra = new Letra();

		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement sql = conexao.prepareStatement("select * from letra where id=?");

			sql.setInt(1, id);

			ResultSet result = sql.executeQuery();

			while (result.next()) {
				letra.setLetra(result.getString("letra"));
				
			}

			conexao.close();

		} catch (Exception e) {
		}
		return letra;
	}

	public boolean inserir(Letra a) {
		int valor = 0;
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement result = conexao
					.prepareStatement("INSERT INTO letra (letra) VALUES (?);");

			result.setString(1, a.getLetra());
			

			valor = result.executeUpdate();
			conexao.close();
		} catch (Exception e) {

		}

		if (valor == 1)
			return true;
		else
			return false;

	}

}
