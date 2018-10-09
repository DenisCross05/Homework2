/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27sumadeserie;

/**
 *
 * @author G6
 */
public class JavaApplication27sumaDeSerie {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
//NUMEROS PARES DEL 1 AL 10 con for

System.out.println("Para este ejercicio eh creado dos secciones de series.");
System.out.println("Primera serie:");
//NUMEROS IMPARES DEL 1 AL 10 con while
int x=5;
while(x<1800)
{
System.out.println("n:"+x);
x=x+5;
}
System.out.println("Segunda serie:");
int j=2;
while(j<1800)
{
System.out.println("n:"+j);
j=j+5;
} 
System.out.println("La suma total de las dos series es:"+j+x);
 }
}

