package com.company;

public class UtilHtml {

    /**
     * retourne une représentation HTML d'un tableau...
     *
     * @param tab     le tableau
     * @param maxRows le nombre maximum de lignes souhaité (doit être >= 0)
     * @return Si le tableau est vide, la méthode retourne la chaine "(vide)"
     * si le tableau contient moins de maxRows lignes, le deuxième
     * paramètre). Il y a autant de  <tr>
     * que d'éléments dans le tableau à concurrence de maxRows lignes,
     * s'il le nombre d'éléments dans le tableau est supérieur à maxRows,
     * la dernière ligne sera définie par "..."
     * <pre>
     *               toHtml({"A","B","C"),3}
     *               =>"<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>C</td></tr></table>";
     *           </pre>
     */
    public String toHtmlTab(Object[] tab, int maxRows) {
        //on C1 les cas exceptionnel
        if (tab.length == 0) return "(vide)";

        if (maxRows == 0) return "";
        // On retire la dernier valeur pour la remplacer par 3 petit points
        if (tab.length > maxRows) maxRows = maxRows - 1;
        if (tab.length < maxRows) maxRows = tab.length;

        String resultat = "<table>";
        for (int i = 0; i < maxRows; i++) resultat += "<tr><td>" + tab[i] + "</td></tr>";
        if (tab.length > maxRows) resultat += "<tr><td>...</td></tr>";
        resultat += "</table>";
        return resultat;

    }
}
