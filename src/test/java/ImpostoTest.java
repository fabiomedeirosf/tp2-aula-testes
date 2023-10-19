import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImpostoTest {

	/**
	 * Criar classe que realize as rotinas inerentes aos
	 * alunos matriculados em curso considerando o fechamento
	 * do semestre letivo.
	 * 
	 * Esta classe deverá ter um método responsável por calcular
	 * a média, aplicando os seguintes critérios:
	 * 	1.Double calcularMedia(Disciplina disciplina)
	 * 		Classe disciplina conterá: nome do aluno, nome disciplina,
	 * 		av1, av2, lista de exercicios.
	 * 			Se houverem mais de 3 exercícios:
	 * 				media = (av1 * 3 + av2 * 2 * media exercicios * 5) / 10
	 * 			senao
	 * 				media = (av1 * 4 = av2 * 5 + media exercicios) / 10
	 * 
	 * 	2. Crie uma função que deverá determinar a situação do aluno
	 * 	   a partir de uma media, sendo os critérios.
	 * 		String aferirSituacao(Double media)
	 * 		
	 * 		sendo:  ate 4 = reprovado
	 * 				de 4 a 6 = recuperacao
	 * 				de 6 a 10 = aprovado
	 * 	
	 */
	
	
	private Imposto imposto;
	
	@Before
	public void inicializarParametrosTeste() {
		this.imposto = new Imposto();
	}
	
	@After
	public void finalizarTestes() {
		this.imposto = null;
	}
	
	@Test
    public void calcularImpostoMGSucesso() {
                 
        Double valor = 1000.00;
        Double impostoEsperado = 40.0;
        
        Double impostoCalculado = imposto.calcularICMS(valor, "MG");
        
        Assert.assertEquals(impostoEsperado, impostoCalculado);
    }
	
	@Test
	public void calcularImpostoOutrosEstadosSucesso() {
        
        Double valor = 1000.00;
        Double impostoEsperado = 100.0;
        
        Double impostoCalculado = imposto.calcularICMS(valor, "SP");
        
        Assert.assertEquals(impostoEsperado, impostoCalculado);
	}
}
