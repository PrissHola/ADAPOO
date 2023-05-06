
public class peliculas {
	private String nombre;
	private String clasificacion;
	private String año;
	public peliculas(String nombre, String clasificacion, String año) {
		
		this.nombre = nombre;
		this.clasificacion = clasificacion;
		this.año = año;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCalificación() {
		return clasificacion;
	}
	public void setCalificación(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getAsignatura() {
		return año;
	}
	public void setAsignatura(String año) {
		this.año = año;
	}
}
