package udb.modulo1.session1.ventas;

import udb.modulo1.session1.FactoriaFactura;
import udb.modulo1.session1.Factura;
import udb.modulo1.session1.FacturaType;

public class Principal2 {

	public static void main(String[] args) {
		Factura f1 = FactoriaFactura.getInstancia(FacturaType.FACTURA_CON_IVA);
		Factura f2 = FactoriaFactura.getInstancia(FacturaType.FACTURA_SIN_IVA);
		
		f1.setNumero(1);
		f1.setConcepto("computador");
		f1.setImporte(13910.00);
		
		f2.setNumero(1);
		f2.setConcepto("Mueble");
		f2.setImporte(3345375.00);
		
		
		
		 System.out.println(f1);
		 System.out.println(f2);
		
	}
	
	public static void imprimir(Factura f) {
		System.out.println("***********");
		System.out.println(f.getImporteTotal());
		System.out.println("***********");
	}

}
