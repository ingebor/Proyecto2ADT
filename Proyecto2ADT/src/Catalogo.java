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

}
