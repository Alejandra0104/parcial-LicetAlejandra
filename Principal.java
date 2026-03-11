// ALejandra Bolaño y Roveiro Osorio

import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos M = new Metodos();
        int n = 0;
        System.out.print("Ingrese la dimension de la matriz: ");
        n = sc.nextInt();

        objMAtributos[][] m1 = new objMAtributos[n][n];
        objMAtributos[][] m2 = new objMAtributos[n][n];
        m1 = M.LLenarMatriz(m1, sc);
        // M.MostrarMatriz(m1,0);
        System.out.println("vamos a llenar al segunda matriz");
        m2 = M.LLenarMatriz(m2, sc);
        // M.MostrarMatriz(m2,0);
        objMAtributos[][] Mr = new objMAtributos[n * n][n];
        Mr = M.FucionarMatrices(m1, m2, Mr);
        M.MostrarMatriz(Mr, 1);
    }

}
