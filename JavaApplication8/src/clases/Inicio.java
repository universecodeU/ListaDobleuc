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
        ListaD l=new ListaD();
        ListaD l2=new ListaD();
        int opc,dato,dato2;
        do {
            opc=Integer.parseInt(JOptionPane.showInputDialog("1.-Ins.Frente\n2.-Recorrido\n3.-Recorrido inverso\n4.-Inserción Ordenada\n5.Muestra lista ordenada\n6.Salir"));	
            switch(opc) {
                    case 1:dato=Integer.parseInt(JOptionPane.showInputDialog("dato a insertar"));
                          l.insFrente(dato);
                          break;
                    case 2:l.recorre();break;

                    case 3: 
                            l.recorreI(); break;
                    case 4:
                            dato2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato "));
                            l2.insOrdenada(dato2);
                            break;
                    case 5: l2.recorre(); break;
                    //case 7:l2.recorreI();break;

            }
        }while (opc!=6);
    }
}
