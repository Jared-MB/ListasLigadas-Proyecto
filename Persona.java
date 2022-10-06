public class Persona {
	private String nombre;
	private int edad;
	private String sexo;
	private String estado;
	Persona(){
		this.nombre = null;
		this.edad = Integer.MIN_VALUE;
		this.sexo = null;
		this.estado = null;
	}
	Persona(String nombre, int edad, String sexo, String estado){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.estado = estado;
	}
	public String getNombre(){
		return this.nombre;
	}
	public int getEdad(){
		return this.edad;
	}
	public String getSexo(){
		return this.sexo;
	}
	public String getEstado(){
		return this.estado;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
}