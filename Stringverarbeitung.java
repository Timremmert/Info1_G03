import static java.lang.String.valueOf;

public class Stringverarbeitung {

	/**
	 * Extrahiere die Ziffer am Ende der Zeichenkette.
	 * @param s Eingabezeichenkette
	 * @return Extrahierte Ziffer
	 */
	public int anonymisiere(String s) {
		int ausgabe = 0;
		
		// Hier vervollstaendigen.
		String[] getLetztenString = s.split("_");
		ausgabe = new Integer(getLetztenString[getLetztenString.length - 1].trim());

		return ausgabe;
	}
	
	/**
	 * Entferne alle Vorkommen des Zeichens c aus der Zeichenkette s
	 * @param s Zeichenkette, aus der die Zeichen entfernt werden sollen
	 * @param c zu entfernendes Zeichen
	 * @return Zeichenkette ohne Vorkommen des Zeichens c
	 */
	public String streiche(String s, char c) {
		String ausgabe = "";
		
		// Hier vervollstaendigen.
		String regex = valueOf(c);

		ausgabe = s.replaceAll(regex, "");
		
		return ausgabe;
	}
	
}
