public class Ejercicio4 {
	public static void main(String[] args){
		Trabajador persona = new Trabajador();

		System.out.println("Datos de persona: "+persona.getNombre()+" "+persona.getEdad()+" "+persona.getTelefono()+" "+persona.getSalario());
		
		persona.setNombre("Miguel Chino");
		persona.setEdad(22);
		persona.setTelefono("6034234");
		persona.setSalario(540);

		System.out.println("Datos de persona: "+persona.getNombre()+" "+persona.getEdad()+" "+persona.getTelefono()+" "+persona.getSalario());

		Cliente cliente = new Cliente();
		System.out.println("Datos de persona: "+cliente.getNombre()+" "+cliente.getEdad()+" "+cliente.getTelefono()+" "+cliente.getCredito());
		
		cliente.setNombre("Miki Angel");
		cliente.setEdad(23);
		cliente.setTelefono("55324634");
		cliente.setCredito(460);		
		
		System.out.println("Datos de persona: "+cliente.getNombre()+" "+cliente.getEdad()+" "+cliente.getTelefono()+" "+cliente.getCredito());
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

class Cliente extends Persona{
	int credito;

	public Cliente(){
		this.credito = 0;
	}

	public void setCredito(int credito){
		this.credito = credito;	
	}

	public int getCredito(){
		return this.credito;
	}

}