package atividade;
import org.junit.Test;
import model.Partida;

import static org.junit.Assert.*;

public class VerificarStatusPartida {

	
	public void test() {
		assertEquals(true, true);
	}
	
	@Test
	public void verificarStatusPartida() {
		Partida partida = new Partida();
		partida.setCampeonato("IFbola");
		partida.setTimeMandante("Campinas");
		partida.setTimeVisitante("Hortolandia");
		
		assertEquals("IFbola", partida.getCampeonato());
		assertEquals("Campinas", partida.getTimeMandante());
		assertEquals("Hortolandia", partida.getTimeVisitante());
		
		assertEquals("aposta_bloqueada", partida.getStatus());
		assertEquals(0, partida.getNumeroApostas());
	}
}
