package one_digitalinovation.gof.Singleton;


/** 
 * Singleton "preguiçoso"
 * @author Mansueto
 *
 */
public class SingletonLazy {

	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();
	
	}
	public static SingletonLazy getInstancia(){
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
		
	}
	
	
}
