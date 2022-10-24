package one_digitalinovation.gof;

import facade.Facade;
import one_digitalinovation.gof.Singleton.SingletonEager;
import one_digitalinovation.gof.Singleton.SingletonLazy;
import one_digitalinovation.gof.Singleton.SingletonLazyHolder;
import one_digitalinovation.gof.strategy.Comportamento;
import one_digitalinovation.gof.strategy.Robo;
import one_digitalinovation.gof.strategy.comportamentoAgressivo;
import one_digitalinovation.gof.strategy.comportamentoDefensivo;
import one_digitalinovation.gof.strategy.comportamentoNormal;

public class Teste {

	public static void main(String[] args) {
		//Singleton 
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager Eager = SingletonEager.getInstancia();
		System.out.println(Eager);
		Eager = SingletonEager.getInstancia();
		System.out.println(Eager);


		SingletonLazyHolder LazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(LazyHolder);
		LazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(LazyHolder);
		
		//Strategy
		
		Comportamento normal = new comportamentoNormal();
		Comportamento defensivo = new comportamentoDefensivo();
		Comportamento agressivo = new comportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Adão", "1000-004");
	}

}
