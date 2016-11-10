
package pokemon;


public class Pokemon implements Capturable{
//nom,  atac (0~50 ), defensa (10~50), punts de salut (20~100)
private String nom;
private int atac;
private int defensa;
private int puntsdesalut;

    public Pokemon(String nom, int atac, int defensa, int puntsdesalut) {
        this.nom = nom;
        this.atac = atac;
        this.defensa = defensa;
        this.puntsdesalut = puntsdesalut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAtac() {
        return atac;
    }

    public void setAtac(int atac) {
        this.atac = atac;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPuntsdesalut() {
        return puntsdesalut;
    }

    public void setPuntsdesalut(int puntsdesalut) {
        this.puntsdesalut = puntsdesalut;
    }

 public void Dades(){
     System.out.println(this.atac);
     System.out.println(this.defensa);
     System.out.println(this.nom);
     System.out.println(this.puntsdesalut);
   
 }

    @Override
    public boolean Capturar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 
 
    
}
