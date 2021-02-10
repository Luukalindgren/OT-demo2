
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

class L�hiKauppa extends Kauppa {
	protected String osoite;

	public L�hiKauppa(String nimi, String osoite) {
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
		return "L�hiKauppa [osoite=" + osoite + ", nimi=" + nimi + "]";
	}
	
}