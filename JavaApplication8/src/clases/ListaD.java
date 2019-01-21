package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author codemcmhome
 */
class ListaD
{
    private NodoD cabeza1;
    private NodoD cabeza2;
	
    public ListaD() {
            cabeza1=null;
            cabeza2=null;

    }
	
    public boolean listaVacia() {
            return (cabeza1==null && cabeza2==null)?true:false;
    }
	
    public void insFrente(int dato) {
        NodoD nuevo=new NodoD(dato);
        if(listaVacia()) {
                cabeza1=nuevo;
                cabeza2=nuevo;	
        } else{
                nuevo.setSig(cabeza1);
                cabeza1.setAnt(nuevo);
                cabeza1=nuevo;
        }
        JOptionPane.showMessageDialog(null,"Dato insertado");
    }
    public void insOrdenada(int dato) {
        NodoD nuevo=new NodoD(dato);
        if(listaVacia()) {
                cabeza1=nuevo;
                cabeza2=nuevo;
        } else {
                    NodoD aux1=cabeza1;
                    NodoD aux2=null;

                    while(aux1!=null && nuevo.getInfo()>aux1.getInfo()) {
                            aux2=aux1;
                            aux1=aux1.getSig();
                    }
                    if(aux2==null) {
                            nuevo.setSig(cabeza1);
                            cabeza1.setAnt(nuevo);
                            cabeza1=nuevo;
                    } else {
                            if(aux1!=null) {
                                    aux2.setSig(nuevo);
                                    nuevo.setSig(aux1);
                                    nuevo.setAnt(aux2);
                                    aux1.setAnt(nuevo);
                            }
                            else {
                                    aux2.setSig(nuevo);
                                    nuevo.setAnt(aux2);
                                    cabeza2=nuevo;
                            }
                    }
		}	
	}
	
    public void recorreI() {
        NodoD aux=cabeza2;
        String miLista="Lista de números \n";

        while(aux!=null)
        {
                miLista+=aux.getInfo()+"\n";
                aux=aux.getAnt();
        }
        JOptionPane.showMessageDialog(null,miLista);
    }
	
    public void recorre() {
        NodoD aux=cabeza1;
        String lista="Lista de números \n";
        while (aux!=null)
        {
                lista+=aux.getInfo()+"\n";
                aux=aux.getSig();
        }
        JOptionPane.showMessageDialog(null,lista);
    }
}