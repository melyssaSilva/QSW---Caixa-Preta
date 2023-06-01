package atividade;
import org.junit.Test;
import model.Usuario;

import static org.junit.Assert.*;

public class VerificaSenha {

	@Test
	public void test() {
		assertEquals(true, true);
	}
	
	@Test
	public void verificaSenha() {
		Usuario usuario = new Usuario();
		usuario.setPassword("senha");
		
		assertEquals("senha", usuario.getPassword());	
	}
}
