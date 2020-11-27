package dominio;

public class Producto{
        private String nombre;
        private String precioProducto;
	    private String marca;

        public Producto(){
                nombre = "";
                precioProducto = "";
        }

        public Producto(String nombre, String precioProducto, String marca){
                this.nombre = nombre;
                this.precioProducto = precioProducto;
                this.marca = marca;
        }

        public String getNombre(){
                return nombre;
        }

        public void setNombre(String nombre){
                this.nombre = nombre;
        }

        public String getPrecioProducto(){
                return precioProducto;
        }

        public void setPrecioProducto(String pProducto){
                this.precioProducto = pProducto;
        }

	public String getMarca(){
		return marca;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

        public String toString(){
                return nombre + " " + precioProducto + "\n";
        }
}

