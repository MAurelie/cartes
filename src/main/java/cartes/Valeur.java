package cartes;

public enum Valeur {
	AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT,
	NEUF, DIX, VALET, DAME, ROI;
	
	public int orderAsGreatest() {
		int nbValeur = Valeur.values().length;
		return (this.ordinal() + nbValeur - 1)%nbValeur;
	}
}
