
public class Enfermedad {
	private String nombre;
	private boolean dolorCabeza;
	private boolean dolorEstomago;
	private boolean vomito;
	private boolean diarrea;
	private boolean estornudo;
	private boolean tos;
	private boolean dolorGeneral;
	private boolean faltaEnergia;
	private String notasAdicionales;
	
	public Enfermedad() {
		nombre = "";
		dolorCabeza = false;
		dolorEstomago = false;
		vomito = false;
		diarrea = false;
		estornudo = false;
		tos = false;
		dolorGeneral = false;
		faltaEnergia = false;
		notasAdicionales = "";
	}
		public Enfermedad(String nombre, boolean dolorCabeza, boolean dolorEstomago, boolean vomito, boolean diarrea, boolean estornudo, boolean tos, boolean dolorGeneral, boolean faltaEnergia, String notasAdicionales) {
			this.nombre = nombre;
			this.dolorCabeza = dolorCabeza;
			this.dolorEstomago = dolorEstomago;
			this.vomito = vomito;
			this.diarrea = diarrea;
			this.estornudo = estornudo;
			this.tos = tos;
			this.dolorGeneral = dolorGeneral;
			this.faltaEnergia = faltaEnergia;
			this.notasAdicionales = "";
	}
		//nombre
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		//dolor de cabeza
		/**
		* Metodo que devuelve el booleano de Dolor de cabeza
		 * @return the dolorCabeza
		 */
		public boolean isDolorCabeza() {
			return dolorCabeza;
		}
		/**
		 * @param dolorCabeza the dolorCabeza to set
		 */
		public void setDolorCabeza(boolean dolorCabeza) {
			this.dolorCabeza = dolorCabeza;
		}
		
		//dolor de estomago
		/**
		* Metodo que retorna un booleano del dolor de estomago
		 * @return the dolorEstomago
		 */
		public boolean isDolorEstomago() {
			return dolorEstomago;
		}
		/**
		 * @param dolorEstomago the dolorEstomago to set
		 */
		public void setDolorEstomago(boolean dolorEstomago) {
			this.dolorEstomago = dolorEstomago;
		}
		
		//vomito
		/**
		* Metodo de retorna un booleano de vomito
		 * @return the vomito
		 */
		public boolean isVomito() {
			return vomito;
		}
		/**
		 * @param vomito the vomito to set
		 * Devuelve un booleano que es vomito
		 */
		public void setVomito(boolean vomito) {
			this.vomito = vomito;
		}
		
		//diarrea
		/**
		* Devuelve booleano de diarrea
		 * @return the diarrea
		 */
		public boolean isDiarrea() {
			return diarrea;
		}
		/**
		 * @param diarrea the diarrea to set
		 */
		public void setDiarrea(boolean diarrea) {
			this.diarrea = diarrea;
		}
		
		//Estornudo
		/**
		Parametro que devuelve un booleano de estornudo
		 * @return the estornudo
		 */
		public boolean isEstornudo() {
			return estornudo;
		}
		/**
		 * @param estornudo the estornudo to set
		 */
		public void setEstornudo(boolean estornudo) {
			this.estornudo = estornudo;
		}
		
		//Tos
		/**
		* Parametro que devuelve un booleano de tos
		 * @return the tos
		 */
		public boolean isTos() {
			return tos;
		}
		/**
		 * @param tos the tos to set
		 */
		public void setTos(boolean tos) {
			this.tos = tos;
		}
		
		//Dolor general
		/**
		* Parametro que devuelve un booleano de dolor general
		 * @return the dolorGeneral
		 */
		public boolean isDolorGeneral() {
			return dolorGeneral;
		}
		/**
		 * @param dolorGeneral the dolorGeneral to set
		 */
		public void setDolorGeneral(boolean dolorGeneral) {
			this.dolorGeneral = dolorGeneral;
		}
		
		//Falta de energias
		/**
		* Parametro que devuelve un booleano isFaltaEnergia
		 * @return the faltaEnergia
		 */
		public boolean isFaltaEnergia() {
			return faltaEnergia;
		}
		/**
		 * @param faltaEnergia the faltaEnergia to set
		 */
		public void setFaltaEnergia(boolean faltaEnergia) {
			this.faltaEnergia = faltaEnergia;
		}
		
		//Notas adicionales
		/**
		 * @return the notasAdicionales
		 */
		public String getNotasAdicionales() {
			return notasAdicionales;
		}
		/**
		 * @param notasAdicionales the notasAdicionales to set
		 */
		public void setNotasAdicionales(String notasAdicionales) {
			this.notasAdicionales = notasAdicionales;
		}
		
		//metodo toString
		@Override
		public String toString() {
			return "Enfermedad [nombre=" + nombre + ", dolorCabeza=" + dolorCabeza + ", dolorEstomago=" + dolorEstomago
					+ ", vomito=" + vomito + ", diarrea=" + diarrea + ", estornudo=" + estornudo + ", tos=" + tos
					+ ", dolorGeneral=" + dolorGeneral + ", faltaEnergia=" + faltaEnergia + ", notasAdicionales="
					+ notasAdicionales + "]";
		}
		
		
		
	
}

