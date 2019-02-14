package com.company;

public class C1 {
    static public int nMax(double[] tab) {
        if (tab.length == 0)    throw new EmptyArgException("call toHtmlTab with maxRow <= 0");

        double max = tab[0];
        int increm = 1;
        for (int i= 1;i<tab.length;i++){
            if (tab[i]==max)increm++;
            if (tab[i]>max){
                max=tab[i];
                increm = 1;
            }
        }
        return increm;
    }
// Params : tab
// (non null), une référence à un tableau de double (flottant sur 64 bits)
// Returns :
// nombre d'éléments de tab de valeur maximale.
// Exception : EmptyArgException
// si tab est vide
// Exemple : si on passe à nMax le tableau double[] t = {1,3,2,3},
// alors nMax retournera 2
}
