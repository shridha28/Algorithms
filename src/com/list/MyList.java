package com.list;

public class MyList<T> {
	
	Object list[];
	
	int index;
	
	
	MyList(int size){
		list = new Object[size];
		index = 0;
	}
	
	public void add (T t) {
		if(index==list.length) {
			Object[] newList = new Object[list.length+(list.length/2)];
			System.arraycopy(list, 0, newList, 0, list.length);
			list = newList;
		}
		list[index++] = t;
	}
	
	public T remove() {
		
		Object removed = null;
		if(list.length>0) {
		  removed= list[0];
		  System.arraycopy(list, 1, list, 0, list.length-1); 
		  list[list.length-1]= null;
		}
		return (T)removed;
	}

	public void add(int i,T t) {
		
	}
	
	
	public static void main(String args[]) {
		MyList<Integer> listP = new MyList(2);
		
		listP.add(67);
		listP.add(6);
		listP.add(6);
		
		listP.remove();
		
	}
}
