package atividade;
import org.junit.Test;
import model.Usuario;

import static org.junit.Assert.*;

public class VerificaEmail {

	@Test
	public void test() {
		assertEquals(true, true);
	}
	
	@Test
	public void verificaEmail() {
		Usuario usuario = new Usuario();
		usuario.setEmail("smelyssa79@");
		
		assertEquals("smelyssa79@", usuario.getEmail());	
	}
}
