package fr.iut.editeur.document;

/**
 * Class that stores the text
 */
public class Document {

    /**
     * text variable
     */
    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Adds text at the end of the current text
     * @param texte the text to add
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Replace a part of the text with another
     * @param debut the start of the zone in number of chars
     * @param fin the end of the zone in number of chars
     * @param remplacement the text to replace the zone with
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Set all letters in the zone to upper case
     * @param debut start of the zone in number of chars
     * @param fin end of the zone in number of chars
     */
    public void majuscules(int debut, int fin) {
        String partieGauche = texte.substring(0, debut);
        String minuscule = texte.substring(debut, fin + 1);
        String majuscule = "";

        for (int i = 0; i < minuscule.length(); i++) {
            majuscule += Character.toUpperCase(minuscule.charAt(i));
        }

        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + majuscule + partieDroite;
    }

    /**
     * Erase a zone in the text
     * @param debut start of the zone in number of chars
     * @param fin end of the zone in number of chars
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    /**
     * Clear the text
     */
    public void clear() {
        this.texte = "";
    }

    /**
     * Insere du texte à index
     * @param index place dans la zone de texte en nomnbre de char
     * @param texte nouveau texte à ajouter
     */
    public void inserer(int index, String texte) {
        remplacer(index+1, index+1, texte);
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
