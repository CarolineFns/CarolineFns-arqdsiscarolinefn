package exerciciosFiguras;

public class Quadrado extends Quadrilatero implements Diagonal {

	@Override
	public String toString() {
		return "Quadrado []";
	}

	public Quadrado(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double calculaDiagonal() {
		double diagonal = 0;

		diagonal = getBase() * (Math.sqrt(2));

		return diagonal;
	}

	@Override
	public double area() {
		double area = 0;

		area = Math.pow(getBase(), 2);

		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = 0;

		perimetro = getBase() * 4;

		return perimetro;
	}
}
