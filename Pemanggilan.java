public class Pemanggilan{
	public static void main(String []args){
	TurunanBinatang k = new TurunanBinatang();
	System.out.println("ABSTARCTION");
	System.out.println("L");
	k.printBergerak();
	k.printBerkembangbiak();
	
	Binatangsatu pgl = new Binatangsatu();
    pgl.setBergerak("Melata");
    pgl.setBerkembangbiak("Berterlur");     
	System.out.println();
	System.out.println("ENCAPSULATION");
	System.out.println("L");
    System.out.println("Bergerak Binatang  = "+pgl.getBergerak());
    System.out.println("Berkembangbiak Binatang  = "+pgl.getBerkembangbiak());
	}
}