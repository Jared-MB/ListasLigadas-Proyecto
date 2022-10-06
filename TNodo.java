public class TNodo {
	private Persona persona;
	private TNodo sig;
	TNodo(){
		this.persona = new Persona();
		this.sig = null;
	}
	TNodo(Persona persona){
		this.persona = persona;
		this.sig = null;
	}
	public void setPersona(Persona persona){
		this.persona = persona;
	}
	public Persona getPersona(){
		return this.persona;
	}
	public void setEnlace(TNodo enlace){
		this.sig = enlace;
	}
	public TNodo getEnlace(){
		return this.sig;
	}
}