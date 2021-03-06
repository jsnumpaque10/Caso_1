public class Servidor extends Thread
{
	private static Servidor[] respondiente;
	private static Buffer buffer;
	private Mensaje mensajeActual ;
	
	
	public void run()
	{
		while(buffer.getNumClientes() > 0)
		{
			mensajeActual = buffer.enviarMensaje();
			if(mensajeActual == null)
			{
				this.yield();
			}
			else
			{
				mensajeActual.setRespuesta(mensajeActual.getRespuesta() +1 );
				mensajeActual.notify();
			}
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		
		respondiente = new Servidor[10];
		for (int i = 0; i < respondiente.length; i++) 
		{
			respondiente[i] = new Servidor();
			respondiente[i].start();
		}
	}

}