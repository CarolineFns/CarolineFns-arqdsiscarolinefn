package exerciciosFiguras;

public class Esfera extends Figura3D {
	private Circulo circulo;

	public Esfera(Circulo circulo) {
		this.circulo = circulo;
	}

	@Override
	public double volume() {
		double volume = 0;

		volume = (4 * Math.PI * (Math.pow(circulo.getRaio(), 3))) / 3;

		return volume;
	}

	@Override
	public String toString() {
		return "Esfera [raio=" + circulo.getRaio() + "]";
	}
}
