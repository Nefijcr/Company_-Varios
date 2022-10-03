/* *MATRIZ DE 10X1O INGRESADO POR TECLADO SUME LA DIAGONAL SECUNDARIA
*/
package Varios;
import java.util.Scanner;
public class Ejercicio5 {
public static void main(String[] args) {
//CRUZADO CHUCOS NEFI JORGE
//ESCRIBIR LA MATRIZ POR TECLADO
int matriz[][]= new int [10][10];
Scanner sc=new Scanner(System.in);
for (int i=0;i<10;i++)
{
for(int j=0;j<10;j++)
{
System.out.println("Introduce un numero: ");
int num=sc.nextInt();
matriz[i][j]=num;
}
} //IMPRIMIR LA MATRIZ
System.out.println("Imprimir numeros de la matriz: ");
for(int i=0;i<10;i++)
{
System.out.println("\n");
for(int j=0;j<10;j++)
{
System.out.print(matriz[i][j]+"\t");
}}
//SUMA DIAGONAL SECUNDARIA
int suma=0;
for (int i=0; i<matriz.length ; i++){
for (int j=0; j<matriz[i].length ; j++){
//SUMA DE LA DIAGONAL PRINCIPAL if(i==j)
//CODIGO DE SUMA SECUNDARIA
if(i+j==(matriz.length-1)){
suma+=matriz[i][j];
}
}
}
System.out.println("\n");
System.out.println("La suma de la diagonal secundaria es: "+suma);
}
}
