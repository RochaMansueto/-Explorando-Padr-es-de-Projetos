package facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.cepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		 String cidade = cepApi.getInstancia().recuperarCidade(cep);
		 String distrito = cepApi.getInstancia().recuperarDistrito(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, distrito);
	}
}
