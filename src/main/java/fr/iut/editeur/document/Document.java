package fr.iut.editeur.document;

/**
 * Classe ou le texte est sauvegarder
 */
public class Document {

    /**
     * Texte sauvegarder
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

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Remplacer une partie de texte de debut a fin par remplacement
     * @param debut debut de le region à mettre en majuscules en nombre de char
     * @param fin fin de le region à mettre en majuscules en nombre de char
     * @param remplacement
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Metter en majuscule une partie du texte de debut a fin
     * @param debut debut de le region à mettre en majuscules en nombre de char
     * @param fin fin de le region à mettre en majuscules en nombre de char
     */
    public void majuscules(int debut, int fin) {
        //TO-DO!
        String texteMaj = texte.substring(debut,fin+1);
        texteMaj = texteMaj.toUpperCase();
        remplacer(debut,fin,texteMaj);

    }

    /**
     * Efface un region du texte de debut à fin
     * @param debut debut de la zone de texte en nombre de char
     * @param fin fin de la zone de texte en nombre de char
     */
    public void effacer (int debut,int fin){
        remplacer(debut,fin,"");
    }

    /**
     * Efface le texte
     */
    public void clear (){
        texte = "";

    }

    /**
     * Insere du texte à index
     * @param index place dans la zone de texte en nomnbre de char
     * @param texte nouveau texte à ajouter
     */
    public void inserer(int index, String texte) {
        remplacer(index+1, index+1, texte);
    }
}
