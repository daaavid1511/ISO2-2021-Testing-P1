package C03_Testing_P1.C03_Testing_P1;

public class Estado {
	//atributos respectivos a la persona
	boolean sana;
	boolean sintomas;
	boolean contactoCovid;
	boolean covidSuperado;
	boolean cartillaVacuRegla;
	//atributos respectivos al ambiente
	int temperatura;
	int humedad;
	boolean nieve;
	boolean lluvia;
	boolean niebla;
	
	//construcctor
	public Estado(boolean sana, boolean sintomas, boolean contactoCovid, boolean covidSuperado,
			boolean cartillaVacuRegla, int temperatura, int humedad, boolean nieve, boolean lluvia, boolean niebla) {
		this.sana = sana;
		this.sintomas = sintomas;
		this.contactoCovid = contactoCovid;
		this.covidSuperado = covidSuperado;
		this.cartillaVacuRegla = cartillaVacuRegla;
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.nieve = nieve;
		this.lluvia = lluvia;
		this.niebla = niebla;
	}
	
	//Metodos necesarios para efectuar recomendación
		
		//Devuelve true si por salud puede hacer alguna actividad y en caso contrario false
	public boolean estadoSaludable() {
		if (sana && !sintomas && !contactoCovid && covidSuperado && cartillaVacuRegla) {
			return true;
		}else {
			return false;
		}
	}
		
		//Devuelve las actividades que puede realizar segun el estado de salud y de tiempo
	public String hacerRecomendacion() {
		String recomendacion="";
		if(estadoSaludable()) {
			if(temperatura<0) {
				if(humedad<15) {
					if(nieve || lluvia) {
						recomendacion+="-Por motivos metereologicos es mejor que permanezca en casa.\n";
					}else {
						recomendacion+="-Puede ir a esquiar, si no se supera el aforo permitido por la legislación pertinente.\n";
					}
				}
			}
			if(temperatura>=0 && temperatura<15) {
				if(humedad<15) {
					if(!lluvia) {
						recomendacion+="-Es posible ir a hacer senderismo, si no se supera aforo del espacio previsto.\n";
					}
				}
			}
			if(temperatura>=15 && temperatura<25) {
				if(!lluvia && !niebla) {
					if(humedad <60) {
						recomendacion+="-Puede ir a hacer turismo al aire libre, si la ciudad no tiene restricciones de confinamiento.\n";
					}
				}
			}
			if(temperatura>=25 && temperatura<35 && !lluvia) {
				recomendacion+="-La recomendación es irse de cañas, si el establecimiento no tiene problemas de aforo.\n";
			}
			if(temperatura>30 && !lluvia) {
				recomendacion+="-La recomendación es irse a la playa o a la piscina. La piscina no puede superar el aforo permitido.\n";
			}
		}else {
			recomendacion="Por motivos de salud, no puede realizar ninguna de las actividades, quedese en casa.\n";
		}
		return recomendacion;
	}
	
}
