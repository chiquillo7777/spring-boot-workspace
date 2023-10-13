package udb.modulo1.session1;

 class FacturaConIva extends Factura {

	public FacturaConIva() {
		// TODO Auto-generated constructor stub
	}

	public FacturaConIva(Integer numero, String concepto, Double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getImporteTotal() {
		// TODO Auto-generated method stub
		return getImporte()*1.13;
	}

	@Override
	public String toString() {
		return "FacturaConIva [getImporteTotal()=" + getImporteTotal() + "]";
	}

}
