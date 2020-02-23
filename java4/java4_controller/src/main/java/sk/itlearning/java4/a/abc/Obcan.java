package sk.itlearning.java4.a.abc;

import java.math.BigDecimal;

public class Obcan {

	private String rodneCislo;
	
	private String meno;
	
	private BigDecimal kredit;

	public String getRodneCislo() {
		return rodneCislo;
	}
	
	public Obcan(String rodneCislo, String meno) {
		setRodneCislo(rodneCislo);
		setMeno(meno);
	}

	public void setRodneCislo(String rodneCislo) {
		rodneCislo = rodneCislo.replace("/", "");
		long rcc = Long.valueOf(rodneCislo);
		if ( rcc % 11 == 0) {
			this.rodneCislo = rodneCislo;
		} else {
			throw new IllegalArgumentException("Zadali ste neplatne rodne cislo");
		}
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	public BigDecimal getKredit() {
		return kredit;
	}

	public void setKredit(BigDecimal kredit) {
		this.kredit = kredit;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Obcan) {
			return rodneCislo.equals( ((Obcan)obj).getRodneCislo() );
		}
		return false;
	}

	@Override
	public int hashCode() {
		rodneCislo = rodneCislo.replace("/", "");
		long rcc = Long.valueOf(rodneCislo);
		return Long.valueOf(rcc/11).hashCode();
	}

	@Override
	public String toString() {
		return "Zakaznik; typ Obcan; RC = " + rodneCislo + "; Meno = " + meno;
	}
	
	@Override
	public Obcan clone() {
		Obcan o = new Obcan(this.rodneCislo, this.meno);
		o.setKredit(this.getKredit());
		return o;
	}

	public static Obcan clone(Obcan o2) {
		Obcan o = new Obcan(o2.rodneCislo, o2.meno);
		o.setKredit(o2.getKredit());
		return o;
	}
	
}
