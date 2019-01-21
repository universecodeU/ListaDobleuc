package clases;
/**
 *
 * @author codemcm
 */
class NodoD
{
	private NodoD ant;
	private int info;
	private NodoD sig;
	
	public NodoD(int dato) {
		ant=null;
		sig=null;
		info=dato;
	}
	
	public void setAnt(NodoD aux) {
		ant=aux;
	}
	
	public void setSig(NodoD aux) {
            sig=aux;
	}
	
	public NodoD getAnt() {
		return ant;
	}
	
	public NodoD getSig() {
		return sig;
	}
	
	public int getInfo() {
		return info;
	}
		
}
