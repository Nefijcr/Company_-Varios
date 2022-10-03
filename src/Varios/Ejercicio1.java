/**
Leer la altura de N personas y calcular la altura media
* Mostrar cuantos hay superiores a la media.
*/
package Varios;
import java.util.Scanner;
/**
**
@author nefij
*/
public class Ejercicio1 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
//CRUZADO CHUCOS NEFI JORGE
Scanner sc=new Scanner(System.in);
int i,N;
int contMas=0, contMenos=0;
double media=0;
// Leer el numero de personas
do{ System.out.print("Numero de personas:");
N=sc.nextInt();
}while(N<=0);
//Se crea el array de tamaño N
double[] alto = new double[N];
//Leer alturas
System.out.println("Lectura de la altura de las personas:");
for (i=0;i<N;i++){
System.out.println("persona"+(i+1)+"=");
alto[i]=sc.nextDouble();
media=media+alto[i];//se suma la estatura leida para calcular la media
}
//Calcular la media
media= media / N;
//recorremos el array para ver cuantos hay mas altos
//que la media y cuantos mas bajos
for(i=0;i<alto.length;i++){
if(alto[i]>media){//Si la estatura es mayor que la media
contMas++;
}else if (alto[i]<media){//si es menor
contMenos++;
}
} //Mostrar resultados
System.out.println("Estatura media:"+media);
System.out.println("Personas con estatura superior a la media:"+contMas);
System.out.println("Personas con estatura inferior a la media:"+contMenos);
}
}