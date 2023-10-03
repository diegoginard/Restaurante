
package restaurante;

import BaseDatos.ProductoData;
import entidades.Producto;


public class Restaurante {

    public static void main(String[] args) {
       
        ProductoData pd = new ProductoData();
        Producto pro = new Producto("Hamburguesa completa" , 1500.00 , true);
        pd.guardarProducto(pro);
    }
    
}
