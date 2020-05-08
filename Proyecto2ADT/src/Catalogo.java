/**
 * 
 */

/**
 * @author Ingebor Rubio
 * @author Andres Say
 *
 */
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Catalogo {
	private List <Enfermedad> listadoEnfermedades;
	private List <Medicina> listadoMedicinas;
	
	public Catalogo()
	{

		listadoEnfermedades = new ArrayList<Enfermedad>();
		listadoMedicinas = new ArrayList<Medicina>();
		llenarCatalogo();
	}
	
	private void llenarCatalogo()  {
		Enfermedad enfermedad;
		Medicina medicina;
		
		try {
			BufferedReader brE = new BufferedReader(new FileReader("Enfermedades.txt"));
			BufferedReader brM = new BufferedReader(new FileReader("Medicinas.txt"));
			
			
			String lineE = brE.readLine();
			String lineM = brM.readLine();
			
			while (lineE != null) {
				String[] AtributosEnf = lineE.split(",");
				
				
				enfermedad = new Enfermedad(AtributosEnf[0],Boolean.parseBoolean(AtributosEnf[1]),Boolean.parseBoolean(AtributosEnf[2]),Boolean.parseBoolean(AtributosEnf[3])
						,Boolean.parseBoolean(AtributosEnf[4]),Boolean.parseBoolean(AtributosEnf[5]),Boolean.parseBoolean(AtributosEnf[6]),Boolean.parseBoolean(AtributosEnf[7])
						,Boolean.parseBoolean(AtributosEnf[8]),AtributosEnf[9]);
				
				listadoEnfermedades.add(enfermedad);

	            lineE = brE.readLine();
			}
			
			while (lineM != null) {
				String[] AtributosMed = lineM.split(",");
				
				medicina = new Medicina(AtributosMed[0],Double.parseDouble(AtributosMed[1]), AtributosMed[2], AtributosMed[3], AtributosMed[4],AtributosMed[5]);
				
				listadoMedicinas.add(medicina);
				
	            lineM = brM.readLine();
			}
			
			brE.close();
			brM.close();
			
			
		}catch(Exception e) {
			
		}
	}
	
	/**
	 * @param nombreEnfermedad
	 * @return cadena de atributos
	 * Este metodo permite ingresar el nombre de la enfermedad y devuelve los atributos de dicha enfermedad con el toString de Enfermedad
	 */
	public String verEnfermedad(String nombreEnfermedad){
		String mensaje = "";
		for (int i = 0; i < listadoEnfermedades.size(); i++) {
			try 
			{
				if(listadoEnfermedades.get(i).getNombre().toLowerCase().equals(nombreEnfermedad.toLowerCase()))
				{
					
					mensaje = listadoEnfermedades.get(i).toString();
				}
			
			}
			catch(Exception e)
			{
				mensaje = "Lo sentimos, no se ha encontrado la enfermedad";
			}
			
		}
		if(mensaje.equals("")) {
			mensaje = "Lo sentimos, no se ha encontrado la enfermedad";
		}
		return mensaje;	
	}
	
	/**
	 * Este metodo permite ingresar el nombre de la medicina y devuelve los atributos de dicha medicina con el toString de medicina
	 * @param nombreMedicina El nombre de la medicina que se desea consultar
	 * @return cadena de atributos de la medicina
	 */
	public String VerMedicina(String nombreMedicina) {
		String mensaje = "";
		for (int i = 0; i < listadoMedicinas.size(); i++) {
			try 
			{
				if(listadoMedicinas.get(i).getNombre().toLowerCase().equals(nombreMedicina.toLowerCase()))
				{
					mensaje = listadoMedicinas.get(i).toString();
				}
				
			}
			catch(Exception e)
			{
				mensaje = "Lo sentimos, no se ha encontrado el medicamento.";
			}
			
		}
		if(mensaje.equals("")) {
			mensaje = "Lo sentimos, no se ha encontrado el medicamento";
		}
		return mensaje;
	}

}
