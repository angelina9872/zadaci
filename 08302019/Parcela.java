package njiva;

public abstract class Parcela {
	/*
	 * Parcela ima jedinstven automatski generisan celobrojan identifikator i zadatu
	 * povrsinu(u kvadratnim metrima) prilikom kreiranja. Mogu da joj se dohvate
	 * sadrzani podaci, kao i jednoslovna vrsta(char). Moze da joj se odredi prinos
	 * u periodu zadatom brojem godina. Moze da se sastavi tekstualni opis u obliku
	 * VRSTA-ID[POVRSINA].
	 */

	private static int UID = 0;
	private double povrsina;
	private int id;

	public Parcela(double povrsina) {
		this.povrsina = povrsina;
		id = ++UID;
	}

	public int getId() {
		return id;
	}

	public static int getUID() {
		return UID;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public char getOznaka(char oznaka) {
		return oznaka;
	}

	public abstract double prinos(int god);

	public abstract char getOznaka();

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getOznaka()).append("-").append(id).append("[").append(povrsina).append("]");
		return sb.toString();
	}
}
