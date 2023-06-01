package atividade;

import static org.junit.Assert.*;
import org.junit.Test;
import model.Usuario;

public class VerificaCadastro {

	@Test
	public void test() {
		assertEquals(true, true);
	}
	
	@Test
	public void verificaCadastro() {
		Usuario usuario = new Usuario();
		usuario.setCpf("47662013880");
		usuario.setEmail("smelyssa79@gmail.com");
		usuario.setPassword("@senha");
		
		assertEquals("47662013880", usuario.getCpf());
		assertEquals("smelyssa79@gmail.com", usuario.getEmail());
		assertEquals("@senha", usuario.getPassword());		
	}

}
