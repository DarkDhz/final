package dominio;

import java.util.ArrayList;

public class Tienda{
        private ArrayList<Producto> coleccionProductos = new ArrayList<>();

    public void annadirProducto(Producto producto){
                coleccionProductos.add(producto);
        }

        public String toString(){
                StringBuilder datos = new StringBuilder();
                for (Producto producto : coleccionProductos){
                        datos.append(producto);
                }
                return datos.toString();
        }
}
