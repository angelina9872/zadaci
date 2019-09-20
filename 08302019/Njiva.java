package njiva;

public class Njiva extends Parcela {
	/*
	 * Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru. Prinos
	 * po kvadratnom metru moze da se promeni. Oznaka vrste je N. Prinos njive se
	 * racuna po formuli: povrsina_parcele*prinosPoKvM*godina. Tekstualni oblik je
	 * Parcela:PrinosPoKvM.
	 */
	private double godisnjiPrinosPoKvM;// set

	public Njiva(double godisnjiPrinosPoKvM, double povrsina) {
		super(povrsina);
		this.godisnjiPrinosPoKvM = godisnjiPrinosPoKvM;
	}

	public void setGodisnjiPrinosPoKvM(double godisnjiPrinosPoKvM) {
		this.godisnjiPrinosPoKvM = godisnjiPrinosPoKvM;
	}

	@Override
	public double prinos(int god) {
		return getPovrsina() + godisnjiPrinosPoKvM * god;
	}
	@Override
	public String toString() {
		return "Parcela: " + godisnjiPrinosPoKvM;
	}

	@Override
	public char getOznaka() {
		return 'N';
	}

}
