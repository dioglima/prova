package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Categorias;



public class CategoriasDAO {
	
	public Categorias listarPorId(int id) {

		Categorias categoria = new Categorias();

		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement sql = conexao.prepareStatement("select * from categorias where id=?");

			sql.setInt(1, id);

			ResultSet result = sql.executeQuery();

			while (result.next()) {
				categoria.setPessoa(result.getString("pessoa"));
				categoria.setCarro(result.getString("carro"));
				categoria.setCidadeEstadoPais(result.getString("cidadeEstadoPais"));
				categoria.setFruta(result.getString("fruta"));
				categoria.setObjeto(result.getString("objeto"));
				categoria.setAnimal(result.getString("animal"));
			}

			conexao.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return categoria;
	}

	public ArrayList<Categorias> listar() {

		ArrayList<Categorias> listaCategorias = new ArrayList<Categorias>();

		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet result = conexao.prepareStatement("SELECT * FROM participante order by dataCadastroParticipante DESC").executeQuery();

			Categorias categoria;

			while (result.next()) {
				categoria = new Categorias();

				categoria.setPessoa(result.getString("pessoa"));
				categoria.setCarro(result.getString("carro"));
				categoria.setCidadeEstadoPais(result.getString("cidadeEstadoPais"));
				categoria.setFruta(result.getString("fruta"));
				categoria.setObjeto(result.getString("objeto"));
				categoria.setAnimal(result.getString("animal"));

				listaCategorias.add(categoria);
			}
			conexao.close();
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
		}
		return listaCategorias;
	}

	public boolean inserir(Categorias a) {
		int valor = 0;
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement result = conexao.prepareStatement(
					"INSERT INTO categorias (pessoa, carro, animal, cidadeEstadoPais, objeto, fruta, participante) VALUES (?,?,?,?,?,?,?)");

			result.setInt(3, 10);
			result.setString(1, a.getPessoa());
			result.setString(2, a.getCarro());
			result.setString(3, a.getAnimal());
			result.setString(4, a.getCidadeEstadoPais());
			result.setString(5, a.getObjeto());
			result.setString(6, a.getFruta());
			//result.setInt(7, a.getId());

			valor = result.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		if (valor == 1)
			return true;
		else
			return false;

	}

	public boolean update(Categorias a, int id) {
		int valor = 0;
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement result = conexao
					.prepareStatement("UPDATE categorias SET pessoa = ?, carro =?, animal = ?, cidadeEstadoPais = ?, "
							+ "objeto = ?, fruta = ? WHERE id = ?");

			result.setString(1, a.getPessoa());
			result.setString(2, a.getCarro());
			result.setString(3, a.getAnimal());
			result.setString(4, a.getCidadeEstadoPais());
			result.setString(5, a.getObjeto());
			result.setString(6, a.getFruta());
			result.setInt(7, id);

			valor = result.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		if (valor == 1)
			return true;
		else
			return false;

	}

	public void deletar(int id) {
		try {

			Connection conexao = new Conexao().getConexao();

			PreparedStatement result = conexao.prepareStatement("DELETE FROM categorias WHERE id = ?;");

			result.setInt(1, id);

			result.executeUpdate();

			conexao.close();
		} catch (Exception e) {

		}
	}

}
