import java.util.Scanner;

public class Metodos 
{
     public objMAtributos[][] LLenarMatriz(objMAtributos[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objMAtributos o = new objMAtributos();
                System.out.print("Ingrese el codigo del producto: ");
                o.setCod(sc.nextInt());
                System.out.print("ingrese el nombre del producto: ");
                o.setNombre(sc.next());
                System.out.print("ingrese la cantidad: ");
                o.setCant(sc.nextInt());
                System.out.print("Ingrese la cantidad minima requerida:  ");
                o.setCantMini(sc.nextInt());
                System.out.println(" ");
                m[i][j] = o;
            }
        }
        return m;
    }

    public void MostrarMatriz(objMAtributos[][] m, int dedonde) {
        if (dedonde == 0) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    if (m[i][j].getCant() != 0 && m[i][j].getCantMini() > m[i][j].getCant()) {
                        System.out.println("Código: " + m[i][j].getCod());
                        System.out.println("Nombre: " + m[i][j].getNombre());
                        System.out.println("Cantidad: " + m[i][j].getCant());
                        System.out.println("Stock Mínimo: " + m[i][j].getCantMini());
                        System.out.println("'----------------------------------------- '\n");
                    }

                }

            }
        } else {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    if (m[i][j] != null && m[i][j].getCantMini() > m[i][j].getCant()) {
                        System.out.println("Código: " + m[i][j].getCod());
                        System.out.println("Nombre: " + m[i][j].getNombre());
                        System.out.println("Cantidad: " + m[i][j].getCant());
                        System.out.println("Stock Mínimo: " + m[i][j].getCantMini());
                        System.out.println("'----------------------------------------- '\n");
                    }

                }

            }
        }

    }

    public objMAtributos[][] FucionarMatrices(objMAtributos[][] m, objMAtributos[][] m2, objMAtributos[][] mr) {
        // repetidos
        for (int i = 0; i < m.length; i++) { // recorrido de la matriz a
            for (int j = 0; j < m.length; j++) {// recorrido de la matriz a
                for (int i1 = 0; i1 < m2.length; i1++) {// recorrido de la matriz b
                    for (int j1 = 0; j1 < m2.length; j1++) {// recorrido de la matriz b
                        if (m[i][j].getNombre().equalsIgnoreCase(m2[i1][j1].getNombre())) {
                            m[i][j].setCant(m[i][j].getCant() + m2[i1][j1].getCant());
                            m2[i1][j1].setCant(0);
                            m2[i1][j1].setNombre(null);
                        }

                    }
                }
            }
        }
        // pasamos todos los valores de la matriz 1 a la matriz resultante
        int fila = 0, i = 0;
        for (i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objMAtributos o = new objMAtributos();
                o.setCod(m[i][j].getCod());
                o.setNombre(m[i][j].getNombre());
                o.setCant(m[i][j].getCant());
                o.setCantMini(m[i][j].getCantMini());
                
                mr[i][j] = o;
            }
        }
        // pasamos los datos de matriz 2 que no esten en la matriz 1 a la matriz resultante
        fila = i;
        for (i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                if (m2[i][j].getCant() != 0) {
                    objMAtributos o = new objMAtributos();
                    o.setCod(m[i][j].getCod());
                    o.setNombre(m[i][j].getNombre());
                    o.setCant(m[i][j].getCant());
                    o.setCantMini(m[i][j].getCantMini());
                    mr[fila][j] = o;
                }
            }
            fila++;
        }
        return mr;
    }
}
