package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import javax.print.Doc;

public class CommandeInserer extends CommandeDocument{
    public CommandeInserer(Document document, String[] parameters){
        super(document, parameters);
    }

    @Override
    public void commandeExecuter() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;index;texte");
            return;
        }
        int index = Integer.parseInt(parameters[1]);
        String texte = parameters[2];
        this.document.inserer(index, texte);
    }
}
