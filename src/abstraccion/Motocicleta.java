package abstraccion;

public class Motocicleta extends Vehiculo {

	//Las anotaciones "@" son indicaciones que le damos a JAVA
	
	
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("La motocicleta está acelerando...");
	}

	
	//La subclase es quien decide cuando y como se sobreescribe el metodo abstracto. Es decir, la subclase implementa el metodo.
	
	
	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("La motocicleta está frenando...");
	}

	
	
}
