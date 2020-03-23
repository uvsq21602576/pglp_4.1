package fr.uvsq.uvsq21602576.pglp_4_1;

import java.util.ArrayList;

/**
 * Représente un annuaire.
 * Contient la racine de l'arbre de composant.
 * @author Flora
 */
public class Annuaire {
    /**
     * Racine de l'arbre de composant.
     */
    private Composant racine;

    /**
     * Constructeur.
     * Crée un annuaire avec pour racine r
     * @param r Racine de l'arbre de composant
     */
    public Annuaire(final Composant r) {
        this.racine = r;
    }

    /**
     * Crée une représentation hierarchique de l'annuaire.
     * La renvoie sous forme de chaine de caractère.
     * (Parcours en profondeur)
     * @return représentation hiérarchique
     */
    public String hierachie() {
        String s = "";
        ArrayList<String> list = racine.hierarchie();
        for (String str : list) {
            s = s.concat(str + "\n");
        }
        return s;
    }

    /**
     * Crée une représentation par groupe de l'annuaire.
     * La renvoie sous forme de chaine de caractère.
     * (Parcours en largeur)
     * @return représentation par groupe
     */
    public String groupe() {
        ArrayList<Composant> aTraiter = new ArrayList<Composant>();
        ArrayList<Composant> aTraiterSuiv = new ArrayList<Composant>();
        aTraiterSuiv.add(racine);
        Composant c;
        String s = "";
        while (!aTraiter.isEmpty() || !aTraiterSuiv.isEmpty()) {
            if (aTraiter.isEmpty()) {
                aTraiter.addAll(aTraiterSuiv);
                aTraiterSuiv.clear();
                s = s.concat("---\n");
            }
            c = aTraiter.remove(0);
            s = s.concat(c.toString() + "\n");
            if (c instanceof IterableComposant) {
                IterateurComposant ite  = ((IterableComposant) c).iterateur();
                while (ite.hasNext()) {
                    aTraiterSuiv.add(ite.next());
                }
            }
        }
        return s;
    }

}
