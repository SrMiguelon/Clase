package excepciones;

public class SalarioInvalidoException  extends Exception{

	public SalarioInvalidoException() {
		super("salario no puede ser menor que 0");
	}

}
