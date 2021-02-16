import java.io.IOException;
import java.util.ArrayList;


public class ClasePrincipal {
	public static void main(String[] args) {
		
		ArrayList<Producto> productos = new ArrayList();
		productos = WebScrapping.sacarProductos();
		String html=PintarHTML.crearTablas(productos);
		AccesoFichero.crearHTML(html);
		String url ="C:\\Users\\Ivan\\webScraping.html";
		try {
			Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chrome.exe " + url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(productos);
		
		
	}
	
}