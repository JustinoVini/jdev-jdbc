package br.com.jdev;

import org.junit.Test;

import br.com.jdev.conexaojdbc.SingleConnection;

public class TesteBancojdbc {

	@Test
	public void initBanco() {
		SingleConnection.getConnection();
	}
}
