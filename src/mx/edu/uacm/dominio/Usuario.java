package mx.edu.uacm.dominio;

public class Usuario {
	private int id;
	private String nombreUsuario;
	private String mensajeUsuario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getMensajeUsuario() {
		return mensajeUsuario;
	}
	public void setMensajeUsuario(String mensajeUsuario) {
		this.mensajeUsuario = mensajeUsuario;
	}
	
}
