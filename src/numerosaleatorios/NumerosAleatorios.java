/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosaleatorios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cristianpreciadosanchez
 */
public class NumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ventanaPrincipal ventana = new ventanaPrincipal();
        ventana.Ventana();
        ventana.show();*/
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresar semilla: ");
        int semilla = read.nextInt();
        int x[] = new int[9];
        int xpo[] = new int[9];
        x[0]=semilla;
        int nCaracteres = Integer.toString(semilla).length();
        int n=0,valorsiguiente=0;
        while(n<8){
            xpo[n]=(int) Math.pow(x[n],2);
            int sigposi=n+1;
            if(nCaracteres % 2 == 0){
                int aux=nCaracteres * 2;
                xpo[n]=Integer.parseInt(String.format("%"+aux+"s", Integer.toString(xpo[n])).replace(' ', '0'));
            }else{
                xpo[n]=Integer.parseInt(String.format("%"+nCaracteres+"s", Integer.toString(xpo[n])).replace(' ', '0'));

            }
            int auxiliar=(Integer.toString(xpo[n]).length()-nCaracteres)/2;
            int suma=auxiliar+nCaracteres;
            valorsiguiente=Integer.parseInt(Integer.toString(xpo[n]).substring(auxiliar,suma));
            x[sigposi]=valorsiguiente;
            System.out.println(x[sigposi]);
            n++;
        }
        System.out.println(Arrays.toString(x));
    }
    
}
