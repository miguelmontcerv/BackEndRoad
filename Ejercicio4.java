public class Ejercicio3 {
	public static void main(String[] args){
		Trabajador persona = new Trabajador();

		System.out.println("Datos de persona: "+persona.nombre+" "+persona.edad+" "+persona.telefono+" "+persona.salario);
		persona.setNombre("Miguel Chino");
		persona.setEdad(22);
		persona.setTelefono("6034234");

		System.out.println("Datos de persona: "+persona.nombre+" "+persona.edad+" "+persona.telefono);
	}
}

class Persona{
	String nombre;
	int edad;
	String telefono;

	public Persona(){
		this.nombre = "*";
		this.edad = 0;
		this.telefono = "*";
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}

	public int getEdad(){
		return this.edad;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public String getTelefono(){
		return this.telefono;
	}
}

class Trabajador extends Persona{
	int salario;

	public Trabajador(){
		this.salario = 0; 
	}

	public void setSalario(int salario){
		this.salario = salario;
	}

	public int getSalario(){
		return this.salario;
	}

}