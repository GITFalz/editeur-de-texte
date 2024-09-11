package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument
{
    public CommandeRemplacer(Document document, String[] paramteres)
    {
        super(document, paramteres);
    }

    public void commandeExecuter() {
        String texte = "";
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;debut;fin;texte");
            return;
        }
        if (parameters.length >= 4) {
            texte = parameters[3];
        }

        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.remplacer(debut, fin, texte);
    }
}
