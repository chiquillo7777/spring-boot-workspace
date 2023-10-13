package udb.modulo1.session1;

public class FactoriaFactura {
	public static Factura getInstancia(FacturaType facturaType) {
			Factura instancia = null;
			switch (facturaType) {
			case FACTURA_CON_IVA:
				instancia = new FacturaConIva();
				break;
				
			case FACTURA_SIN_IVA:
				instancia = new FacturaSinIva();
				break;	
		}
		return instancia;
	}
}
