package arqdsis;

public class Ordenacao {
	/**
	 * @param v
	 *            vetor de inteiros a ser ordenado Ordena usando uma ordenacao
	 *            por bolha
	 * @return vetor v ordenado em ordem crecente
	 */
	public int[] crescente(int[] v) {
		for (int i = v.length - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (v[j] > v[j + 1]) {
					int aux = v[j + 1];
					v[j + 1] = v[j];
					v[j] = aux;
				}
			}
		}
		return v;
	}

}
