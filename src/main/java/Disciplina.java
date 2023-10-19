import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	private String nome;
	
	private String disciplina;
	
	private Double av1;
	
	private Double av2;
	
	private List<Double> listaExercicios = new ArrayList<Double>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Double getAv1() {
		return av1;
	}

	public void setAv1(Double av1) {
		this.av1 = av1;
	}

	public Double getAv2() {
		return av2;
	}

	public void setAv2(Double av2) {
		this.av2 = av2;
	}

	public List<Double> getListaExercicios() {
		return listaExercicios;
	}

	public void setListaExercicios(List<Double> listaExercicios) {
		this.listaExercicios = listaExercicios;
	}
	
	
}
