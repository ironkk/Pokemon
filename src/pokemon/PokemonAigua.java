/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author dam
 */
public class PokemonAigua extends Pokemon implements Capturable{
 private String tipus;
 private String efectiuContra;
 private String debilContra;

    public PokemonAigua(String nom, int atac, int defensa, int puntsdesalut) {
        super( nom,  atac,  defensa,  puntsdesalut);
        
        this.tipus = "Aigua";
        this.efectiuContra = "Foc";
        this.debilContra = "Planta";
        
        
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getEfectiuContra() {
        return efectiuContra;
    }

    public void setEfectiuContra(String efectiuContra) {
        this.efectiuContra = efectiuContra;
    }

    public String getDebilContra() {
        return debilContra;
    }

    public void setDebilContra(String debilContra) {
        this.debilContra = debilContra;
    }
 
    @Override
    public boolean Capturar(){
        int numeroAleatorio = (int) (Math.random()*120+19);
        
        int variable = numeroAleatorio - this.getPuntsdesalut();
        System.out.println("Nombre : " +this.getNom());
        if(variable > this.getDefensa()){
            System.out.println("Pokemón Capturat!");
          return true;
        }
        else{
            System.out.println("NO CAPTURAT");
            System.out.println("ATAQUE"+this.getAtac()+"NOMBRE"+this.getNom()+"DEFENSA"+this.getDefensa());
            return false;
        }
        
    }
    
     @Override
    public void Dades(){
    super.Dades();
         System.out.println(this.debilContra);
         System.out.println(this.efectiuContra);
         System.out.println(this.tipus);
        
    }
    
 
}
