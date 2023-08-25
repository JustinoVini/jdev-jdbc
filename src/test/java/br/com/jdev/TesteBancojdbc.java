package br.com.jdev;

import org.junit.Test;

import br.com.jdev.dao.UserPosDAO;
import br.com.jdev.model.Userposjava;

public class TesteBancojdbc {

	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(6L);
		userposjava.setNome("Paulo");
		userposjava.setEmail("novo@email.com");
		
		userPosDAO.salvar(userposjava);
	}
}
