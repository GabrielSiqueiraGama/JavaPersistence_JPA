package teste.muitosPmuitos;

import modelo.muitosPmuitos.Sobrinho;
import modelo.muitosPmuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		Tio tio1 = new Tio("Roger");
		Tio tio2 = new Tio("Paulo");
		
		Sobrinho sobrinho1 = new Sobrinho("Bill");
		Sobrinho sobrinho2 = new Sobrinho("Davi");
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
	}
	
}
