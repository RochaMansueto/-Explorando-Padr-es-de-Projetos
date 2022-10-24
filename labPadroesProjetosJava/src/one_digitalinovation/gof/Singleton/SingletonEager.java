package one_digitalinovation.gof.Singleton;

/** 
 * Singleton "Apressado"
 * @author Mansueto
 *
 */
public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();

	public SingletonEager() {
		super();
	}
	public static SingletonEager getInstancia() {
		return instancia;
	}
	
	
}
