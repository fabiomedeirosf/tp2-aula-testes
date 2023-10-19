
public class Imposto { 

	  public Double calcularICMS(Double valor, String estado) {
	        
        Double valorICMS;
        
        if("MG".equals(estado)) {
            valorICMS = valor * 0.04;
        } else {
            valorICMS = valor * 0.1;
        }
        
        return valorICMS;
    }
}
