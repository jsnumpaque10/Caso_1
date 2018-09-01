
public class Buffer
{
	/**
	 * Variable que modela la cantidad de clientes del sistema en un tiempo dado.
	 */
	private int numClientes; 
	/**
	 * Variable que modela la cantidad limitada de mensajes que puede almacenar el buffer.
	 */
	private int capacidadMensajes;
	/**
	 * Variable que modela la cantidad de mensajes que hay en el buffer en un momento dado.
	 */
	private int cantidadMensajes; 
	
	public Buffer(int pCapacidadMensajes, int pNumClientes)
	{
		setCapacidadMensajes(pCapacidadMensajes);
		setNumClientes(pNumClientes);
		setCantidadMensajes(0);
	}

	public int getNumClientes() {
		return numClientes;
	}

	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}

	public int getCapacidadMensajes() {
		return capacidadMensajes;
	}

	public void setCapacidadMensajes(int capacidadMensajes) {
		this.capacidadMensajes = capacidadMensajes;
	}

	public int getCantidadMensajes() {
		return cantidadMensajes;
	}

	public void setCantidadMensajes(int cantidadMensajes) {
		this.cantidadMensajes = cantidadMensajes;
	}

}
