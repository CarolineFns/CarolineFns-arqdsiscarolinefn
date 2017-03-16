package exerciciosFiguras;

public class Cilindro extends Figura3D {

	private Circulo circulo;
	private double altura;

	public Cilindro(Circulo circulo, double altura) {
		this.circulo = circulo;
		setAltura(altura);
	}

	@Override
	public String toString() {
		return "Cilindro [circulo=" + circulo + ", altura=" + altura + "]";
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Cilindro(Circulo circulo) {
		this.circulo = circulo;
	}

	@Override
	public double volume() {
		double volume = 0;

		volume = Math.PI * Math.pow(circulo.getRaio(), 3) * getAltura();

		return volume;
	}
}
