
public class ProcesarB extends ProcesarPadre{

	@Override
	public void mostrarValues(ParametroSensor parametro) {
		System.out.println("Mostrar valor "+this.getClass()+": "+parametro.getValor());	
	}

}
