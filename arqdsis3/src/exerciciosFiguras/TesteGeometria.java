package exerciciosFiguras;

import java.util.ArrayList;

public class TesteGeometria {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(5));
		figuras.add(new Losango(10, 5));
		figuras.add(new Quadrado(5, 5));
		figuras.add(new Retangulo(5, 10));
		figuras.add(new Triangulo(5, 15, 5, 10, 5));
		figuras.add(new Trapezio(5, 6, 7, 4, 7, 4, 7));
		figuras.add(new Cubo(new Quadrado(5, 5)));
		figuras.add(new Esfera(new Circulo(25)));
		figuras.add(new Cilindro(new Circulo(5), 5));
		figuras.add(new Piramide(new Quadrado(5, 5), new Triangulo(5, 5, 2, 2, 2)));

		for (Figura figura : figuras) {
			System.out.println(figura);

			if (figura instanceof Figura2D) {
				System.out.println("\nÁrea: " + ((Figura2D) figura).area());
				System.out.println("\nPerímetro: " + ((Figura2D) figura).perimetro());
			}

			if (figura instanceof Diagonal) {
				System.out.println("\nDiagonal: " + ((Diagonal) figura).calculaDiagonal());
			}

			if (figura instanceof Figura3D) {
				System.out.println("\nVolume: " + ((Figura3D) figura).volume());
			}

			System.out.println("-----------------------------------");
		}
	}
}