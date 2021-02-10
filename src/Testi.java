
public class Testi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Kauppa {
	protected String nimi;
	
	public Kauppa(String nimi) {
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	@Override
	public String toString() {
		return "Kauppa [nimi=" + nimi + "]";
	}
}

class LähiKauppa extends Kauppa {
	protected String osoite;

	public LähiKauppa(String nimi, String osoite) {
		super(nimi);
		this.osoite = osoite;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	@Override
	public String toString() {
		return "LähiKauppa [osoite=" + osoite + ", nimi=" + nimi + "]";
	}
	
}