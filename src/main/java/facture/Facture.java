package facture;

import java.io.PrintStream;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Facture {
    private int numero;
    private Date emission;
    private Client destinataire;
    List<LigneFacture> listelignes = new ArrayList<>();
    
    public Facture(Client destinataire, Date emission, int numero) {
        this.destinataire = destinataire;
        this.emission = emission;
        this.numero = numero;
    }

    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Get the value of emission
     *
     * @return the value of emission
     */
    public Date getEmission() {
         return emission;
    }

    /**
     * Get the value of destinataire
     *
     * @return the value of destinataire
     */
    public Client getDestinataire() {
         return destinataire;
    }


    
    public void ajouteLigne(Article a, int nombre, float remise) {
        LigneFacture lg = new LigneFacture(nombre,this,a,remise);
        listelignes.add(lg);
   }
    
   public float montantTTC(float tauxTVA) {
        float ttc = 0;
        for(LigneFacture o : listelignes){
        ttc +=  o.montantLigne();  
        }
        return ttc * (1f+tauxTVA);
   }
   
   public void print(PrintStream out, float tva) {
        System.out.print("tva :" + tva);
   }
   
}
