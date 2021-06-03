package ejercicio1;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

;

	public class MainPedirDatos {
		private static final Logger LOGGER = LogManager.getLogger(MainPedirDatos.class);

		public static void main(String[] args) {
			
			List lista = new ArrayList();
			Scanner teclado = new Scanner(System.in);
			
			int valor;
			do {
				System.out.println("Introduzca un valor: (0 para salir)");
				valor = teclado.nextInt();
				
				
				
				Nodo nodo = new Nodo(valor);
				if(valor!=0) {
					lista.add(nodo);
				}
				if (valor%2 == 0) {
					LOGGER.info("Se ha introducido un valor par a las ");
				}else {
					LOGGER.info("Se ha introducido un valor impar el día");
				}
			}while(valor!=0);
		}
	}
