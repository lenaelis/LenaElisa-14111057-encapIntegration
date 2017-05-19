public class TurunanBinatang extends Binatang{
	protected void printJenis(){
		System.out.println("Jenis Binatang = "+super.getJenis());
	}
	protected void printNama(){
		System.out.println("Nama Binatang = "+super.getNama());
	}
	
}