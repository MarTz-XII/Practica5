package ed.ito;

public interface Cola<E> {
	public void add(E item) throws ExcepcionDeColaLlena;
	public E remove() throws ExcepcionDeColaVacia;
	public boolean isFull();
	public boolean isEmpty();
	public int size();
	public E first() throws ExcepcionDeColaVacia;
	public E last() throws ExcepcionDeColaVacia;
	public void clear();
	public int search(E item);
}
