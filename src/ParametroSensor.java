
public class ParametroSensor {

	private Class<? extends ProcesarPadre> classType;
	private Object valor;
	
	public ParametroSensor(Class<?  extends ProcesarPadre> classType, Object valor){
		this.classType = classType;
		this.valor = valor;
	}

	public Class<? extends ProcesarPadre> getClassType() {
		return classType;
	}

	public void setClassType(Class<? extends ProcesarPadre> classType) {
		this.classType = classType;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}
	
	
}
