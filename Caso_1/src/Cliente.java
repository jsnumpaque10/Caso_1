import java.util.Random;

public class Cliente extends Thread
{
	private Mensaje mensaje;
	private int idCliente;
	private static Buffer buffer;
	private static int CantidadClientes = 100;
	private static int CantidadMensajes = 5;
	private int mensajesEnviados =0;
	
	public static void main (String args)
	{
		
		Cliente[] clientes = new Cliente[CantidadClientes];
		
		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente();
			clientes[i].start();
		}
	}
	public void run()
	{

		while(mensajesEnviados < CantidadMensajes)
		{
			
		mensaje = new Mensaje(randInt(0,999999));
		buffer.recibir(mensaje);
		mensajesEnviados ++;
		
		}
		
	}
	
	
	/**
	 * Genera un numero random entre el rango indicado
	 * @param min
	 * @param max
	 * @return num random
	 */
	public static int randInt(int min, int max) 
	{
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}
	 

}
