package atividade;
import org.junit.Test;
import model.Partida;
import model.Aposta;
import model.Usuario;

import static org.junit.Assert.*;

public class ValidarCriarAposta {

	
	public void test() {
		assertEquals(true, true);
	}
	
	@Test
	public void criaAPosta() {
		Partida partida = new Partida();
		Usuario usuario = new Usuario();
		Aposta aposta = new Aposta();
		
		usuario.setCpf("47662013880");
		usuario.setEmail("smelyssa79@gmail.com");
		usuario.setPassword("@senha123");
		
		partida.setCampeonato("IFbola");
		partida.setTimeMandante("Campinas");
		partida.setTimeVisitante("Hortolandia");
		
		partida.liberarApostas();
		
		assertTrue(partida.estaDisponivelReceberApostas());
		
		aposta.setApostador(usuario);
		aposta.setPartida(partida);
		aposta.setGolsMandate(3);
		aposta.setGolsVisitante(1);
		
		assertTrue(aposta.enviar());	
	}
	
	@Test
	public void criaAPostaBloqueado() {
		Partida partida = new Partida();
		Usuario usuario = new Usuario();
		Aposta aposta = new Aposta();
		
		usuario.setCpf("47662013880");
		usuario.setEmail("smelyssa79@gmail.com");
		usuario.setPassword("@senha123");
		
		partida.setCampeonato("IFbola");
		partida.setTimeMandante("Campinas");
		partida.setTimeVisitante("Hortolandia");
		
		assertFalse(partida.estaDisponivelReceberApostas());
		
		aposta.setApostador(usuario);
		aposta.setPartida(partida);
		aposta.setGolsMandate(3);
		aposta.setGolsVisitante(1);
		
		assertTrue(aposta.enviar());	
	}
	
	@Test
	public void validaCampos() {
		Partida partida = new Partida();
		Usuario usuario = new Usuario();
		Aposta aposta = new Aposta();
		
		usuario.setCpf("47662013880");
		usuario.setEmail("smelyssa79@gmail.com");
		usuario.setPassword("@senha123");
		
		partida.setCampeonato("IFbola");
		partida.setTimeMandante("Campinas");
		partida.setTimeVisitante("Hortolandia");
		
		partida.liberarApostas();
		
		assertTrue(partida.estaDisponivelReceberApostas());
		
		aposta.setApostador(usuario);
		aposta.setPartida(partida);
		aposta.setGolsMandate(-1);
		aposta.setGolsVisitante(0);
		
		assertTrue(aposta.enviar());	
	}
	
	@Test
	public void verificaSaldo() {
		Partida partida = new Partida();
		Usuario usuario = new Usuario();
		Aposta aposta = new Aposta();
		
		usuario.setCpf("47662013880");
		usuario.setEmail("smelyssa79@gmail.com");
		usuario.setPassword("@senha123");
		
		partida.setCampeonato("IFbola");
		partida.setTimeMandante("Campinas");
		partida.setTimeVisitante("Hortolandia");
		
		partida.liberarApostas();
		
		assertTrue(partida.estaDisponivelReceberApostas());
		
		aposta.setApostador(usuario);
		aposta.setPartida(partida);
		aposta.setGolsMandate(3);
		aposta.setGolsVisitante(1);
		
		assertTrue(aposta.enviar());	
		
		float moedasIniciais = usuario.getMoedas();
		
		usuario.diminuirMoedas();
		
		assertEquals(usuario.getMoedas(), (moedasIniciais - 50), 0.0f);
	}
	
	@Test
	public void saldoNegativo() {
		Partida partida = new Partida();
		Usuario usuario = new Usuario();
		Aposta aposta = new Aposta();
		
		usuario.setCpf("47662013880");
		usuario.setEmail("smelyssa79@gmail.com");
		usuario.setPassword("@senha123");
		
		partida.setCampeonato("IFbola");
		partida.setTimeMandante("Campinas");
		partida.setTimeVisitante("Hortolandia");
		
		partida.liberarApostas();
		
		assertTrue(partida.estaDisponivelReceberApostas());
		
		aposta.setApostador(usuario);
		aposta.setPartida(partida);
		aposta.setGolsMandate(3);
		aposta.setGolsVisitante(1);
		
		usuario.diminuirMoedas();
		usuario.diminuirMoedas();
		usuario.diminuirMoedas();
		usuario.diminuirMoedas();
		usuario.diminuirMoedas();
		
		assertFalse(usuario.temSaldoSuficiente());
		
		assertTrue(aposta.enviar());	
	}
	
	@Test
	public void verificaNumApostas() {
		Partida partida = new Partida();
		Usuario usuario = new Usuario();
		Aposta aposta = new Aposta();
		
		usuario.setCpf("47662013880");
		usuario.setEmail("smelyssa79@gmail.com");
		usuario.setPassword("@senha123");
		
		partida.setCampeonato("IFbola");
		partida.setTimeMandante("Campinas");
		partida.setTimeVisitante("Hortolandia");
		
		partida.liberarApostas();
		
		assertTrue(partida.estaDisponivelReceberApostas());
		
		aposta.setApostador(usuario);
		aposta.setPartida(partida);
		aposta.setGolsMandate(3);
		aposta.setGolsVisitante(1);
		
		int numApostas = partida.getNumeroApostas();
		
		assertEquals(partida.getNumeroApostas(), 0);
		
		assertTrue(aposta.enviar());	
		
		assertEquals(partida.getNumeroApostas(), (numApostas + 1));
	}
}
