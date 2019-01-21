package clases;

/**
 *
 * @author codemcmhome
 */
import javax.swing.*;
public class Inicio
{
    public static void main(String []a)
    {
        ListaD listaDoble=new ListaD();
        ListaD listaOrdenada=new ListaD();
        int opc,dato,dato2;
        do {
            opc=Integer.parseInt(JOptionPane.showInputDialog("1.-Ins.Frente\n2.-Recorrido\n3.-Recorrido inverso\n4.-Inserción Ordenada\n5.Muestra lista ordenada\n6.Salir"));	
            switch(opc) {
                    case 1:dato=Integer.parseInt(JOptionPane.showInputDialog("dato a insertar"));
                          listaDoble.insFrente(dato);
                          break;
                    case 2:
                        listaDoble.recorre();break;

                    case 3: 
                            listaDoble.recorreI(); break;
                    case 4:
                            dato2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato "));
                            listaOrdenada.insOrdenada(dato2);
                            break;
                    case 5: listaOrdenada.recorre(); break;
                    //case 7:l2.recorreI();break;

            }
        }while (opc!=6);
    }
}
