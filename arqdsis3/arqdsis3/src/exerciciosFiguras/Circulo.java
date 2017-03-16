package exerciciosFiguras;

public class Circulo extends Figura2D {

	public Circulo(double raio) {
		setRaio(raio);
	}

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		double area = 0;

		area = (Math.PI) * (Math.pow(getRaio(), 2));

		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = 0;

		perimetro = 2 * (Math.PI) * getRaio();

		return perimetro;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}
}
