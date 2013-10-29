package prueba2810;

public class UserDiego {

	private String nombre;
	private String segundoNombre;
	private String apellido;
	
	public UserDiego() {
		nombre = null;
		segundoNombre = null;
		apellido = null;
	}
	
	public String toString() {
		return "" + nombre + segundoNombre + apellido;
	}
	
	public void ComerPibe(Object obj){
		if(obj instanceof LeonelNievas) {
			System.out.println("Me encanta, me lo como todo");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
