package aye2_practica7;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinario<T extends Comparable<T>> implements Comparable<ArbolBinario> {
	private T raiz;
	private ArbolBinario<T> si;
	private ArbolBinario<T> sd;
	int alturaArbol;
	List<Object> lista;
	
	
	public ArbolBinario(T dato) {
		raiz=dato;
	}

	public T getRaiz() {
		return raiz;
	}

	public void setRaiz(T raiz) {
		this.raiz = raiz;
	}

	public ArbolBinario<T> getSi() {
		return si;
	}

	public void setSi(ArbolBinario<T> si) {
		this.si = si;
	}

	public ArbolBinario<T> getSd() {
		return sd;
	}

	public void setSd(ArbolBinario<T> sd) {
		this.sd = sd;
	}
	
	public void insertar(T dato) {
		int comparacion = raiz.compareTo(dato);
		if (comparacion>0) {
			if(si==null) {
				si=new ArbolBinario<T>(dato);
			} else {
				si.insertar(dato);
			}
		} else {
			if (comparacion < 0) {
				if (sd==null) {
					sd = new ArbolBinario<T>(dato);
				} else {
					sd.insertar(dato);
				}
			}
		}
		
	}
	
	@Override
	public int compareTo(ArbolBinario<T> o) {
		return raiz.compareTo(o.getRaiz());
	}
	
	public boolean esHoja() {
		return si==null && sd==null;
	}
	
	public int altura() {
		if(esHoja()) {
			return 1;
		} else {
			int alturaI = 0;
			int alturaD = 0;
			if (si!=null) {
				alturaI=si.altura();
			}
			if (sd!=null) {
				alturaD=sd.altura();
			}
			return Math.max(si.altura(), sd.altura());
		}
		
	}
	
	public List<Object> inOrder() {
		lista = new ArrayList<>();
		inOrder2();
		return lista;
	}
	
	public void inOrder2(){
		if (si!=null) {
			si.inOrder2();
		}
		lista.add(getRaiz());
		if (sd!=null) {
			sd.inOrder2();
		}
	}
	
	public void mostrarInOrder() {
		if(si!=null) {
			si.mostrarInOrder();
		}
		System.out.println(getRaiz());
		if (sd!=null) {
			sd.mostrarInOrder();
		}
	}
	
	
	

}
