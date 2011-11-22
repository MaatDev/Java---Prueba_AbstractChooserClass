import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<SensorPadre> sensores = new ArrayList<SensorPadre>();
		
		//Agregar los diferentes sensores que uno puede definir
		sensores.add(new SensorA());
		sensores.add(new SensorB());
		sensores.add(new SensorC());
		
		ArrayList<ParametroSensor> parametros = new ArrayList<ParametroSensor>();
		
		for(SensorPadre padre: sensores){
			//Guardar todos los parámetros que retorna el sensor
			parametros.add(padre.obtenerParametro());			
		}
		
		for(ParametroSensor params: parametros){
			
			try {
				//Procesar cada parámetro según el sensor que retorno el valor
				ProcesarPadre procesar = params.getClassType().asSubclass(ProcesarPadre.class).newInstance();
				procesar.mostrarValues(params);
				
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
	
}
