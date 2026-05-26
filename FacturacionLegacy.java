package facturacion;

/**
 * Clase Legacy del sistema de facturación.Comprueba el descuento a aplicar
 * según el tipo de Cliente
 */
public class FacturacionLegacy {
    //Constantes
    private static final int CLIENTE_SOCIO = 2;
    private static final int CLIENTE_VIP = 1;
    private static final double DESCUENTO_ESTANDAR = 0.05;
    private static final double DESCUENTO_VIP = 0.15;
    private static final double DESCUENTO_VIP_EXTRA = 0.25;
    // Método refactorizado
    /**
     * 
     * @param importeBase El importe introducido
     * @param tipoCliente El valor que tiene cada tipo de cliente
     * @param esSocioVipExtra La afirmación de si es VIP o VIP_EXTRA
     * @return Devuelve el importe con el descuento aplicado dependiendo del 
     * tipo de cliente: VIP,VIP_EXTRA,SOCIO,CLIENTE
     */
    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVipExtra) {
        //Comprueba si es VIP    
        if (tipoCliente == CLIENTE_VIP) {
            //Comprueba si es VIP con EXTRA
            if (esSocioVipExtra == true) {
                //Devuelve con el descuento VIP_EXTRA aplicado
                return importeBase - (importeBase * DESCUENTO_VIP_EXTRA);
            }
            //Devuelve con el descuento VIP aplicado
            return importeBase - (importeBase * DESCUENTO_VIP);
        }
        //Comprueba si es SOCIO  
        if (tipoCliente == CLIENTE_SOCIO) {
            //Devuelve con el descuento SOCIO aplicado 
            return importeBase - (importeBase * DESCUENTO_ESTANDAR);
        }
        //Devuelve sin aplicar descuento si es CLIENTE sin más
        return importeBase;

    }

}
