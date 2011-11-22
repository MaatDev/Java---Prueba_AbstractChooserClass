
public class SensorC extends SensorPadre{

	@Override
	public ParametroSensor obtenerParametro() {
		return new ParametroSensor(ProcesarC.class, true);
	}

}
