package br.com.jdev;

import java.util.List;

import org.junit.Test;

import br.com.jdev.dao.UserPosDAO;
import br.com.jdev.model.BeanUserFone;
import br.com.jdev.model.Telefone;
import br.com.jdev.model.Userposjava;

public class TesteBancojdbc {

	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();

		userposjava.setNome("Paulo");
		userposjava.setEmail("novo@email.com");

		userPosDAO.salvar(userposjava);
	}

	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();

			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("==============================");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void initBuscar() {
		UserPosDAO dao = new UserPosDAO();

		try {
			Userposjava userposjava = dao.buscar(6L);

			System.out.println(userposjava);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void initAtualizar() {
		try {

			UserPosDAO dao = new UserPosDAO();

			Userposjava userposjava = dao.buscar(6L);
			
			userposjava.setNome("Novo nome para o Paulo");
			
			dao.atualizar(userposjava);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void initDeletar() {
		
		try {
			
			UserPosDAO dao = new UserPosDAO();
			dao.deletar(5L);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testeInsertTelefone() {
		
		Telefone telefone = new Telefone();
		telefone.setNumero("11 9898989898");
		telefone.setTipo("Celular");
		telefone.setUsuario(1L);
		
		UserPosDAO dao = new UserPosDAO();
		
		dao.salvarTelefone(telefone);
	}
	
	@Test
	public void testeCarregaFonesUser() {
		UserPosDAO dao = new UserPosDAO();
		
		List<BeanUserFone> lista = dao.listaUserFone(8L);
		
		for (BeanUserFone beanUserFone : lista) {
			System.out.println(beanUserFone);
			System.out.println("=========================================================");
		}
		
	}
}
