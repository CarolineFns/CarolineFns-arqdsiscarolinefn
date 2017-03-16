package exerciciosFiguras;

public abstract class Poligono extends Figura2D {
	private double base;
	private double altura;
	
	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}
	
}
