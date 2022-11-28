package ed.ito;

public class NodoCola<E> {
	
	private E item;
	private NodoCola<E> sig;
	
	public NodoCola(E item) {
		this.item=item;
		sig=null;
	}
	
	public E getItem() {
		return item;
	}
	public void setItem(E item) {
		this.item = item;
	}
	public NodoCola<E> getSig() {
		return sig;
	}
	public void setSig(NodoCola<E> sig) {
		this.sig = sig;
	}

}
