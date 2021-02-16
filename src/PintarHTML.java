import java.util.ArrayList;

public class PintarHTML {

	public static String crearTablas(ArrayList<Producto> productos) {
		String html="<html><head><title>Amazon</title><style type='text/css'>table, th, td { text-align: center; border:1px solid black; border-collapse: collapse}</style></head><body><table>";
		html+="<tr><th>Foto</th><th>Producto</th><th>Precio</th></tr>";
		for (Producto producto : productos) {
			html+="<tr><td><img src='"+producto.getFoto()+"'></td><td>"+producto.getTitulo()+"</td><td>"+producto.getPrecio()+"€</td></tr>";
		}		
		return html+"</table></body></html>";
	}

}
