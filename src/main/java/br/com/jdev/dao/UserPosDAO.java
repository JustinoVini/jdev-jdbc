package br.com.jdev.dao;

import java.sql.Connection;

import br.com.jdev.conexaojdbc.SingleConnection;

public class UserPosDAO {
	
	private Connection connection;
	
	public UserPosDAO() {
		connection = SingleConnection.getConnection();
	}
	
}
