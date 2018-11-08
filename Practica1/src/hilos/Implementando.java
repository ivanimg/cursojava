package hilos;

public class Implementando implements Runnable {

	@Override
	public void run() {
		System.out.println("Dentro de un run de runnable");
		
		Implementando i = new Implementando();
		i.run();
		
	}

}
