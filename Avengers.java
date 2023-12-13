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
    private String superheld;
    private double superheldenKraft;

    public Avengers(){
        this.superheldenKraft = 100.0;
        this.superheld = "normaler Mensch";
    }

    /**
     * Setzen des Attributs superheldenName
     * @param neuerSuperheldenName
     */
    public void setSuperheldenName(String neuerSuperheldenName){
        this.superheldenName = neuerSuperheldenName;
        this.superheld = "Superheld";
    }

    /**
     * Setzen des Attributs alterEgoName
     * @param neuerEgoName
     */
    public void setAlterEgoName(String neuerEgoName){
        this.alterEgoName = neuerEgoName;
        this.superheld = "normaler Mensch";
    }

    /**
     * Halbierung des gespeicherten Werts im Attribut superheldenKraft
     */
    public void vollbringeHeldentat(){
        this.superheldenKraft = superheldenKraft / 2;
    }

    /**
     * Lesen des Attributs <code>superheldenKraft</code>
     * @return
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
        this.superheld = "Superheld";
    }

    /**
     * Setzen des Attributs <code>superheld</code> auf den Wert "normaler Mensch"
     */
    public void werdeNormalerMensch(){
        this.superheld = "normaler Mensch";
    }

    /**
     * Überprüfung, ob Objekt ein Superheld ist
     * @return
     */
    public boolean isSuperheld(){
        return this.superheld == "Superheld";
    }

    /**
     * Liefert superheldenName oder alterEgoName zurück
     * @return
     */
    public String sageName(){
        if(this.superheld == "Superheld"){
            return superheldenName;
        }
        else{
            return alterEgoName;
        }
    }



}
