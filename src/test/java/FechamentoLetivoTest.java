import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FechamentoLetivoTest {

	private FechamentoLetivo fechamento;
	
	@Before
	public void inicializar() {
		this.fechamento = new FechamentoLetivo();
	}
	
	@After
	public void finalizarCenario() {
		this.fechamento = null;
	}
	
	@Test
	public void alunoAprovado() {
		
		Double media1 = 6.0;
		Double media2 = 9.6;
		
		String situacao = this.fechamento.aferirSituacao(media1);
		String situacao2 = this.fechamento.aferirSituacao(media2);
		
		assertEquals(FechamentoLetivo.APROVADO, situacao);
		assertEquals(FechamentoLetivo.APROVADO, situacao2);
	}
	
}
