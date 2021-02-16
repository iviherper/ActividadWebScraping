
public class Producto {
	private String foto;
	private String titulo;
	private String precio;
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public Producto(String foto, String titulo, String precio) {
		super();
		this.foto = foto;
		this.titulo = titulo;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [foto=" + foto + ", titulo=" + titulo + ", precio=" + precio + "]";
	}
	
	
}
