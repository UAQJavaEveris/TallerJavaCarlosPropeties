package mx.com.everis.taller.propeties.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;
public class TestPropeties {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Idioma(español, english, aLEMAN):");
			String idiomaIn = in.readLine().toLowerCase().trim();
			Locale lengua;
			if(idiomaIn=="español"){
				lengua = new Locale("es");
				
			}else if(idiomaIn=="english")
			{
				lengua = Locale.US;
				
			}else if(idiomaIn=="aleman")
			{
				lengua = Locale.GERMAN;
			}else{
				lengua = Locale.getDefault();
			}
			
			

			ResourceBundle form= ResourceBundle.getBundle("mx.com.everis.tallerjava.properties.idioma",lengua);
			System.out.println(form.getString("nombre"));
			String sexo = in.readLine();
			System.out.println(form.getString("sexo"));
			String edad = in.readLine();	
			System.out.println(form.getString("edad"));
			String Direccion = in.readLine();
			System.out.println(form.getString("Direccion"));
			String pais = in.readLine();
			System.out.println(form.getString("pais"));
			

		} catch (IOException e) {
			
			e.printStackTrace();
}

	}

}
