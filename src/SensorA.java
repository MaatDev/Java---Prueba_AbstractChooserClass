
public class SensorA extends SensorPadre{

	@Override
	public ParametroSensor obtenerParametro() {
		return new ParametroSensor(ProcesarA.class, "Hola");
	}

}
