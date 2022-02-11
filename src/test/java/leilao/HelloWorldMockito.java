package leilao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;
import junit.framework.Assert;

public class HelloWorldMockito {
	
	@SuppressWarnings("deprecation")
	@Test
	void hello() {
		LeilaoDao mock = Mockito.mock(LeilaoDao.class);
		List<Leilao> todos = mock.buscarTodos();
		assertTrue(todos.isEmpty());
	}


}
