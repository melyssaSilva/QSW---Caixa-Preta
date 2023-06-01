package atividade;
import org.junit.Test;
import model.Usuario;

import static org.junit.Assert.*;

public class VerificaCPF {

	@Test
	public void test() {
		assertEquals(true, true);
	}
	
	@Test
	public void verificaMaiorCPF() {
		Usuario usuario = new Usuario();
		usuario.setCpf("4766201388099");
		
		assertEquals("4766201388099", usuario.getCpf());	
	}
	
	@Test
	public void verificaMenorCPF() {
		Usuario usuario = new Usuario();
		usuario.setCpf("476620");
		
		assertEquals("476620", usuario.getCpf());	
	}

}
