package br.com.jdev.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.jdev.conexaojdbc.SingleConnection;
import br.com.jdev.model.Userposjava;

public class UserPosDAO {
	
	private Connection connection;
	
	public UserPosDAO() {
		connection = SingleConnection.getConnection();
	}
	
	public void salvar(Userposjava userposjava) { /*Recebe a classe para salvar*/
		try {
		String sql = "insert into userposjava (id, nome, email) values (?, ?, ?)"; /*manda a instrução*/
		PreparedStatement insert = connection.prepareStatement(sql); /*Finaliza o comando*/
		insert.setLong(1, userposjava.getId());
		insert.setString(2, userposjava.getNome());
		insert.setString(3, userposjava.getEmail());
		
		insert.execute();	
		
		connection.commit(); /*Salva no banco*/
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
