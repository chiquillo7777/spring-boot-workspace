package udb.modulo1.session1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacturaConIva f1 = new FacturaConIva(1, "computador", 1230.40);
		FacturaSinIva f2 = new FacturaSinIva(2, "Mueble Delux", 240.00);
		
		System.out.println("***********");
		System.out.println(f1.getImporteTotal());
		System.out.println("***********");
		System.out.println("***********");
		System.out.println(f2.getImporteTotal());
		System.out.println("***********");
		

	}

}
