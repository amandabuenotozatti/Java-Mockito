package br.com.alura.leilao.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.alura.leilao.dao.LeilaoDao;

class FinalizarLeilaoServiceTest {

	private FinalizarLeilaoService service;
	
	@Test
	void deveriaFinalizarUmLeilao() {
		LeilaoDao dao = Mockito.mock(LeilaoDao.class);
		service = new FinalizarLeilaoService(dao);
	}

}
