package com.gen.lojagames;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.gen.lojagames.model.CategoriaModel;
import com.gen.lojagames.model.ProdutoModel;
import com.gen.lojagames.model.UserLogin;
import com.gen.lojagames.model.UsuarioModel;

class TestesUnitarios {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	public void test1() {
		CategoriaModel cm = new CategoriaModel();
		ProdutoModel pm = new ProdutoModel();
		pm.setCategoriaRelacionada(cm);
		assertNotNull(pm);	
		
	}
	@Test
	public void test2() {
		ProdutoModel pm = new ProdutoModel();
		pm.setDescricaoTitulo("titulo");
		assertEquals("titulo",pm.getDescricaoTitulo());
	}
	@Test
	public void test3() {
		ProdutoModel pm = new ProdutoModel();
		pm.setDescricaoTitulo("teste");
		assertEquals("teste",pm.getDescricaoTitulo());
	}
	
	@Test
	public void test4() {
		CategoriaModel cm = new CategoriaModel();
		cm.setNomeCategoria("testes");
		assertEquals("testes",cm.getNomeCategoria());
		
	}
	@Test
	public void test5() {
		CategoriaModel cm =  new CategoriaModel();
		Long a = (long) 200000;
		cm.setId(a);
		assertEquals(200000,cm.getId());
		
	}
	@Test
	public void test6() {
		UserLogin login = new UserLogin();
		login.setSenha("123");
		assertEquals("123",login.getSenha());
		
	}
	
	@Test
	public void test7() {
		UserLogin login = new UserLogin();
		assertEquals(2,login.calculo(1));
		
	}
	@Test
	public void test8() {
		UsuarioModel a = new UsuarioModel();
		a.setUsuario("siririco");
		assertEquals("siririco", a.getUsuario());
		
	}
	@Test
	public void test9() {
		UsuarioModel a = new UsuarioModel();
		a.setNome("junin");
		assertEquals("",a.getNome());
		
		
	}
	@Test
	public void test10() {
		UsuarioModel a = new UsuarioModel();
		a.setSenha("561");
		assertEquals("561",a.getSenha());
	}

}
