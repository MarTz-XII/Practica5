package ed.ito;

public class ColaDinamica<E> implements Cola<E> {
 private NodoCola <E> p=null;
    private NodoCola<E> u=null;
    private int n=0;
    private int limite;
	
	public ColaDinamica() {
		this.limite=50;
		this.clear();
	}
	
	public ColaDinamica(int limite) {
		this.limite=limite;
		this.clear();
	}
	@Override
	public void add(E item) throws ExcepcionDeColaLlena {
            if(this.isFull())
                throw new ExcepcionDeColaLlena();
            NodoCola<E> nuevo=new NodoCola<E>(item);
            if(this.isEmpty()){
                this.p=nuevo;
                this.u=nuevo;
            }else{
                this.u.setSig(nuevo);
                this.u=nuevo;
            }
            this.n++;
	}

	@Override
	public E remove() throws ExcepcionDeColaVacia {
            
            if(this.isEmpty())
                throw new ExcepcionDeColaVacia();
            E algo=this.p.getItem();
            if(this.p==this.u){
                this.p=this.u=null;
            }else
                this.p=this.p.getSig();
            this.n--;
            return algo;
	}

	@Override
	public boolean isFull() {
		if(n==limite)
		return true;
                else
                    return false;
	}

	@Override
	public boolean isEmpty() {
		if(n==0)
                    return true;
		return false;
	}

	@Override
	public int size() {
		return this.n;
	}

	@Override
	public E first() throws ExcepcionDeColaVacia {
		if(isEmpty())
                    throw new ExcepcionDeColaVacia();
                return this.p.getItem();
	}

	@Override
	public E last() throws ExcepcionDeColaVacia {
		if(isEmpty())
                    throw new ExcepcionDeColaVacia();
                return this.u.getItem();
	}

	@Override
	public void clear() {
		this.p=this.u=null;
                this.n=0;

	}

	@Override
	public int search(E item) {
		NodoCola<E> aux=this.p;
                int i=1, k=-1;
                while(aux!=null){
                    if(aux.getItem().equals(item)){
                        k=i;
                        break;
                    }
                    aux=aux.getSig();
                    i++;
                }
                return k;
	}

}
    
    
