
public class Lista implements ListTAD {
	int count = 0;
	int qtde = 0;
	Object data[] = new Object [10];
	
	
	
	public static void main(String[] args) {
		
	}
	
	@Override
	public void add(Object element) {
		// TODO Auto-generated method stub
		data[(data.length)+1] = element;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		for (int c=index; c<data.length; c++) {
			if (count == data.length) {
				Object eTemp[] = new Object[20];
				for (int i=0; i<data.length; i++) {
					
				} 
			}
		}
		e1[index] = element;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
