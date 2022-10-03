/*
* Crear un array bidimensional de tamaño 7x7 y rellenalo de forma que los
elementos de la diagonal principal sean 1 y el resto 0. Muestra el array por pantalla en forma de
cuadrado.
*/
package Varios;
import java.util.Arrays;
public class Ejercicio4 { 
public static void main(String[] args) {
//CRUZADO CHUCOS NEFI JORGE
int[][]matriz = new int[7][7];
int f;
for (f=0 ; f < matriz.length ; f++){
matriz[f][f]=1;
} for (f=0;f<matriz.length ;f++){
System.out.println(Arrays.toString (matriz [f]));
}
}
}
