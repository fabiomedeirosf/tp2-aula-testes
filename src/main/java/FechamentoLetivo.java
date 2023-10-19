import java.util.List;

public class FechamentoLetivo {
	
	public static final String APROVADO = "aprovado";
	public static final String RECUPERACAO = "recuperação";
	public static final String REPROVADO = "reprovado";

	public Double calcularMedia(Disciplina disciplina) {
		
		Double mediaExercicios = 
				this.mediaExercicios(disciplina.getListaExercicios());
		
		Double mediaDisciplina = null;
		if(disciplina.getListaExercicios().size() > 3) {
			
			mediaDisciplina = (disciplina.getAv1() * 3 + 
							   disciplina.getAv2() * 2 +
							   mediaExercicios * 5) / 10;

		} else {
			mediaDisciplina = (disciplina.getAv1() * 4 +
					   		   disciplina.getAv2() * 5 +
					   		   mediaExercicios);
		}
		
		return mediaExercicios;
		
	}
	
	public String aferirSituacao(Double media) {
		
		if(media < 4) {
			return REPROVADO;
		} else if (media >=4 && media < 6) {
			return RECUPERACAO;
		} else {
			return APROVADO;
		}
	}
	
	private Double mediaExercicios(List<Double> exercicios) {
		
		if(exercicios.isEmpty()) {
			return 0D;
		}
		
		Double media = 0D;
		
		for(Double exercicio : exercicios) {
			media += exercicio;
		}
		
		return (media / exercicios.size());
	}
}
