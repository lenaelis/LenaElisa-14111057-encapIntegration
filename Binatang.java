public abstract class Binatang {
    protected String jenis  = "Mamalia";
    protected String nama = "Kucing";

    protected String getJenis(){
        return jenis;
    }
    protected String getNama(){
        return nama;
    }    
    protected abstract void printJenis();
	
    protected abstract void printNama();
}