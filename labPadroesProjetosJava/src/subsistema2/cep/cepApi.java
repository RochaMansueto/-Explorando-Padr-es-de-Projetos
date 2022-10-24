package subsistema2.cep;

public class cepApi {
	private static cepApi instancia = new cepApi();

	public cepApi() {
		super();
	}
	public static cepApi getInstancia() {
		return instancia;
	}
	public String recuperarCidade(String cep) {
		return "Lisboa";
		
	}
	public String recuperarDistrito(String cep) {
		return "GrandeLisboa";
		
	}
}
