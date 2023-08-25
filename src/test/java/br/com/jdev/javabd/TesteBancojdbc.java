package br.com.jdev.javabd;

import org.junit.Test;

import br.com.jdev.javabd.conexaojdbc.SingleConnection;

public class TesteBancojdbc {
	
	@Test
	public void initBanco() {
		SingleConnection.getConnection();
	}
}
