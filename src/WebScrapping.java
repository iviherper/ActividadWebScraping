import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WebScrapping {
	
	public static ArrayList<Producto> sacarProductos(){
	ArrayList<Producto> productos = new ArrayList();
	Document doc;
	try {
		doc = Jsoup.connect("https://www.amazon.es/ordenadores/s?k=moviles").get();
		Elements fotos = doc.getElementsByClass("s-image");
		Elements titulos = doc.getElementsByClass("a-size-base-plus a-color-base a-text-normal");
		Elements precios = doc.getElementsByClass("a-price-whole");
		for (int i=0;i<fotos.size()-1;i++) {
		  productos.add(new Producto(fotos.get(i).absUrl("src"),titulos.get(i).text(),precios.get(i).text()));
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return productos;
	}
	
}
