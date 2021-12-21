import java.util.Scanner;

public class Proyecto {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner entrada = new Scanner(System.in);
		String dnileer = "";
		int var = 0;
		int cuser = 0;///Variable para saber cuando hay que crear al usuario
		String [][] datos = new String[1000][9];
for( int i = 0 ;i < 1001 ;i++ ) {
		
	for( int j = 0 ;j < 10 ;j++ ) {
		datos[i][j] = "NONE";
	}
		}
		datos[0][0] = "123456556165161651656678";datos[0][1] = "Javier Garcia Fernandez";
		datos[0][2] = "1275€";datos[0][3] = "1,25";datos[0][4] = "Jaén";
		datos[0][5] = "Jaén";datos[0][6] = "13";datos[0][7] = "15/05/1980";datos[0][8] = "12345678";
		
		
		System.out.println( "Bienvenido inserte su DNI para ingresar en su cuenta");
		dnileer = entrada.next();
		
		for( int i = 0 ;i < 1001 ;i++ ) {
			
			if (dnileer == datos[i][8]) {
				
			}
			else if (datos[i][8] == "NONE"){
				var = i;
					i = 1002;
					cuser = 1;//No existe pues lo creamos
			}
			
		}
		
		//Creacion de usuario.
		if (cuser == 1){
			datos[var][8] = dnileer;
			
			
			
			System.out.println( "Inserte su numero de cuenta");
			dnileer = entrada.next();
			datos[var][0] = dnileer;
			
			System.out.println( "Inserte su nombre y apellidos");
			dnileer = entrada.next();
			datos[var][1] = dnileer;
			
			System.out.println( "Cuanto saldo tienes es tu cuenta");
			dnileer = entrada.next();
			datos[var][2] = dnileer;
			
			System.out.println( "Cuanto interes anual tiene");
			dnileer = entrada.next();
			datos[var][3] = dnileer;
			
			System.out.println( "Introduce la provincia en la que resides");
			dnileer = entrada.next();
			datos[var][4] = dnileer;
			
		}
		
		
		
	}

}
