package atividade;
import org.junit.Test;
import model.Usuario;

import static org.junit.Assert.*;

public class VerificaMoedaInicio {

	@Test
	public void test() {
		assertEquals(true, true);
	}
	
	@Test
	public void verificaSaldo() {
		float moedas = 200;
		Usuario usuario = new Usuario("smelyssa79@gmail.com", "47662013880", "@senha");
	
		assertEquals(usuario.getMoedas(), moedas, 0.0f);	
	}
}
