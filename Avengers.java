package Blatt_9;

/**
 * Klasse Avengers zur Aufgabe 37 von Blatt 9
 * @author Tim Remmert
 * @author Lennart Jekel
 * @author Elias Schering
 * @version 1.0 2023/12/12
 */
public class Avengers {
    private String superheldenName;
    private String alterEgoName;
    private boolean superheld = false;
    private double superheldenKraft = 100.0;

    /**
     * Setzen des Attributs <code>superheldenName</code>
     * @param neuerSuperheldenName
     */
    public void setSuperheldenName(String neuerSuperheldenName){
        this.superheldenName = neuerSuperheldenName;
        this.superheld = true;
    }

    /**
     * Setzen des Attributs <code>alterEgoName</code>
     * @param neuerEgoName
     */
    public void setAlterEgoName(String neuerEgoName){
        this.alterEgoName = neuerEgoName;
        this.superheld = false;
    }

    /**
     * Halbierung des gespeicherten Werts im Attribut <code>superheldenKraft</code>
     */
    public void vollbringeHeldentat(){
        this.superheldenKraft = superheldenKraft / 2;
    }

    /**
     * Lesen des Attributs <code>superheldenKraft</code>
     * @return double of superheldenKraft
     */
    public double getSuperheldenKraft(){
        return this.superheldenKraft;
    }

    /**
     * Setzen des Attributs <code>superheldenKraft</code> auf 100.0
     */
    public void erholeDich(){
        this.superheldenKraft = 100.0;
    }

    /**
     * Setzen des Attributs <code>superheld</code> auf den Wert "Superheld"
     */
    public void werdeSuperheld(){
        this.superheld = true;
    }

    /**
     * Setzen des Attributs <code>superheld</code> auf den Wert "normaler Mensch"
     */
    public void werdeNormalerMensch(){
        this.superheld = false;
    }

    /**
     * Überprüfung, ob Objekt ein Superheld ist
     * @return boolean
     */
    public boolean isSuperheld(){
        return this.superheld;
    }

    /**
     * Liefert Wert des Attribhuts <code>superheldenName</code> oder <code>alterEgoName</code> zurück
     * @return String of superheldenName or alterEgoName
     */
    public String sageName(){
        if(this.superheld){
            return superheldenName;
        }
        else{
            return alterEgoName;
        }
    }

    public static void main (String[] args){

        Avengers ironMan = new Avengers();

        }

}
