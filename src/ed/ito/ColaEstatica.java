package ed.ito;

public class ColaEstatica<E> implements Cola<E> {
	
	private E items[];
	private int p,u;
	private int limite;
	
	public ColaEstatica() {
		this.limite=50;
		this.clear();
	}
	
	public ColaEstatica(int limite) {
		this.limite=limite;
		this.clear();
	}

	@Override
	public void add(E item) throws ExcepcionDeColaLlena {
		// TODO Auto-generated method stub
        if(this.isFull())
        	throw new ExcepcionDeColaLlena();
        if(this.isEmpty())
        	p++;
        items[++u]=item;
	}

	@Override
	public E remove() throws ExcepcionDeColaVacia {
		// TODO Auto-generated method stub
		if(this.isEmpty())
			throw new ExcepcionDeColaVacia();
		E algo=items[p];
		if(p==u)
			p=u=-1;
		else {
			for(int i=0;i<u;i++)
				items[i]=items[i+1];
			u--;
		}
		return algo;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return u==items.length-1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return p==-1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return u+1;
	}

	@Override
	public E first() throws ExcepcionDeColaVacia {
		// TODO Auto-generated method stub
		if(this.isEmpty())
			throw new ExcepcionDeColaVacia();
		return items[p];
	}

	@Override
	public E last() throws ExcepcionDeColaVacia {
		// TODO Auto-generated method stub
		if(this.isEmpty())
			throw new ExcepcionDeColaVacia();
		return items[u];
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
        this.items= (E[])(new Object[this.limite]);
        this.p=this.u=-1;
	}

	@Override
	public int search(E item) {
		// TODO Auto-generated method stub
		int e=-1;
		for(int i=0;i<=u;i++)
			if(this.items[i].equals(item)) {
				e=i+1;
				break;
			}
		return e;
	}

}
