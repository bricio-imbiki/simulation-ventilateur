/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import javax.swing.JOptionPane;

/**
 *
 *
 */
public class Ventilation {
    
    int statutAlimentation; // 0:OFF; 1:ON
    int niveau; // 0; 1; 2; 3
    
    int niveau_temporaire; // if ventilation is OFF, but you click button of niveau

    public int getNiveau_temporaire() {
        return niveau_temporaire;
    }

    public void setNiveau_temporaire(int niveau_temporaire) {
        this.niveau_temporaire = niveau_temporaire;
    }
    
    // default Methods
    
    public Ventilation(int statutAlimentation, int niveau) {
        this.statutAlimentation = statutAlimentation;
        this.niveau = niveau;
    }

    public int getStatutAlimentation() {
        return statutAlimentation;
    }

    public void setStatutAlimentation(int statutAlimentation) {
        this.statutAlimentation = statutAlimentation;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Ventilation{" + "statutAlimentation=" + statutAlimentation + ", niveau=" + niveau + '}';
    }
    
    // custom methods
    
    public boolean estAlimenter() {
        return getStatutAlimentation() ==1;
    }
    
    public void miseEnMarche(int niveau) {
        if (estAlimenter())
            setNiveau(niveau);
        else
            JOptionPane.showMessageDialog(null, "Ventilateur non alimenté");
    }
    
    
}
