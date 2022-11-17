/*
 * @autor: Oscar.S
 * @Version: 1.0
 * 2022
 */

import java.util.Scanner;

public class Calculadora1 {

	public static void main(String[] args) {
		// colores
		String verde="\033[32m";
		String rojo="\033[31m";
		String amarillo ="\033[33m";
		String cyan="\033[36m";
		String reset="\u001B[0m";
		
		
		

		Scanner in = new Scanner(System.in);
		// Titulo
		System.out.println("╔═════════════════════╗");
		System.out.println("║ Creado por Oscar.S  ║");
		System.out.println("║    Calculadora      ║");
		System.out.println("║      En Java        ║");
		System.out.println("╚═════════════════════╝");
		// OPCIONES
		System.out.println("╔═════════════════════╗");
		System.out.println("║      OPCIONES       ║");
		System.out.println("║                     ║");
		System.out.println("║ ► 1) SUMA           ║");
		System.out.println("║ ► 2) RESTA          ║");
		System.out.println("║ ► 3) MULTI          ║");
		System.out.println("║ ► 4) DIVISION       ║");
		System.out.println("╚═════════════════════╝");

		// SELECCION
		System.out.println();
		System.out.println("«« SELECIONE UNA OPCION »» ");
		System.out.println();
		System.out.print("OPCION >> "+amarillo);
		byte numero = (byte) in.nextInt();
		if (numero == 1) {
			System.out.println();
			System.out.println(cyan+"    OPCION SUMA " +verde+"(ACTIVADA)   "+reset);
			System.out.println();
			System.out.print("NUMERO: "+verde);
			long suma1 = in.nextInt();
			System.out.println();
			System.out.print(reset+"NUMERO: "+verde);
			long suma2 = in.nextInt();
			long res_suma = suma1 + suma2;
			System.out.println();
			System.out.println();
			System.out.println(reset+"La suma de " + suma1 + " + " + suma2 + " es igual a [" + res_suma + "]");

		} else if (numero == 2) {
			System.out.println();
			System.out.println("    OPCION RESTA "+verde+"(ACTIVADA)   "+reset);
			System.out.println();
			System.out.print("NUMERO: "+verde);
			long resta1 = in.nextInt();
			System.out.println();
			System.out.print("NUMERO: "+verde);
			long resta2 = in.nextInt();
			long res_resta = resta1 - resta2;
			System.out.println();
			System.out.println("La resta de " + resta1 + " - " + resta2 + " es igual a [" + res_resta + "]");
		} else if (numero == 3) {
			System.out.println();
			System.out.println("    OPCION MULTIPLICACION "+verde+"(ACTIVADA)   "+reset);
			System.out.println();
			System.out.print("NUMERO: "+verde);
			long mult1 = in.nextInt();
			System.out.println();
			System.out.print("NUMERO: "+verde);
			long mult2 = in.nextInt();
			long res_mult = mult1 * mult2;
			System.out.println();
			System.out.println("La Multiplicacion de " + mult1 + " x " + mult2 + " es igual a [" + res_mult + "]");

		} else if (numero == 4) {
			System.out.println();
			System.out.println("    OPCION DIVISION (ACTIVADA)   ");
			System.out.println();
			System.out.print("NUMERO: "+verde);
			long div1 = in.nextInt();
			System.out.println();
			System.out.print("NUMERO: "+verde);
			long div2 = in.nextInt();
			long res_div = div1 * div2;
			System.out.println();
			System.out.println("La Division de " + div1 + " % " + div2 + " es igual a [" + res_div + "]");
			System.out.println();

		}
		else {
			System.out.println();
			System.out.println(rojo+" ESTE NUMERO NO ESTA EN EL RANGO DEL MENU! "+reset);
			System.out.println();
		}
		

		
		
		
	// FUERA DE LAS FUNCIONES
	}
}
