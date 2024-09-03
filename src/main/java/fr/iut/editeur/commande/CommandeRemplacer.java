package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        if(parameters.length>3){
            String texte = parameters[3];
            this.document.remplacer(debut,fin,texte);
            super.executer();
        }

    }
}
