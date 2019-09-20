package njiva;

public class Suma extends Parcela {
	/*
	 * Suma je parcela koja ima zadate povrsinu koju zauzimaju stabla, prinos po
	 * zrelom stablu i period sazrevanja od zasada do sece izrazen u celom broju
	 * godina. Oznaka vrste je S. Prinos se ostvaruje formulom
	 * povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje).
	 * Tekstualni oblik je *Parcela:(povrsStabla,prinosSt,Period). Ovo se ostvaruje
	 * pozivom super.toString();
	 */
	private double povrsinaStabla;
	private double prinosPoStablu;
	private double periodSazrevanja;

	public Suma(double povrsinaStabla, double prinosPoStablu, double periodSazrevanja, double povrsina) {
		super(povrsina);
		this.povrsinaStabla = povrsinaStabla;
		this.prinosPoStablu = prinosPoStablu;
		this.periodSazrevanja = periodSazrevanja;
	}
	@Override
	public char getOznaka() {
		return 'S';
	}
	
	@Override
	public double prinos(int god) {
		return getPovrsina() / povrsinaStabla * prinosPoStablu * (god / periodSazrevanja);
	}
	@Override
	public String toString() {
	return "Parcela: ("+povrsinaStabla+","+prinosPoStablu+","+periodSazrevanja+")";
}
}