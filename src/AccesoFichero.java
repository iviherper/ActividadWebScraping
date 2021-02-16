import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AccesoFichero {

	public static void crearHTML(String html) {
		File f = new File("C:\\Users\\Ivan\\webScraping.html");
		try {
			FileWriter fw = new FileWriter(f);
			fw.write(html);
			System.out.println(html);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
