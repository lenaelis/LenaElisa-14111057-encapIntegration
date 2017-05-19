public class Binatangsatu {
    private String bergerak;
    private String berkembangbiak;
    
    //konstruktor
    public Binatangsatu(){
        this.bergerak="Melata";
        this.berkembangbiak="Bertelur";
    }
    public Binatangsatu(String be, String ber){
        this.bergerak = be;
        this.berkembangbiak = ber;
    }    
    public void setBergerak(String be){
        this.bergerak=be;
    }
    public void setBerkembangbiak(String ber){
        this.berkembangbiak = ber;        
    }
    public String getBergerak(){
        return this.bergerak;
    }
    public String getBerkembangbiak(){
        return this.berkembangbiak;
    }    
}