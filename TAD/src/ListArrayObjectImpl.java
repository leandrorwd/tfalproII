public class ListArrayObjectImpl<E> implements ListTAD<E> {
	private static final int INITIALSIZE = 10;
	private E[] data;
	private int count;
	private int capacity;

	public ListArrayObjectImpl() {
		data = (E[]) new Object[INITIALSIZE];
		count = 0;
		capacity = INITIALSIZE;
	}

	public static void main(String[] args) {

	}

	@Override
	public void add(E element) {
		// TODO Auto-generated method stub
		int temp = capacity;
		if (count == capacity) {
			capacity += INITIALSIZE;
			E[] newData = (E[]) new Object[capacity];
			for (int i = 0; i < capacity; i++) {
				newData[i] = data[i];
			}
			data = newData;
			data[temp] = element;
		} else {
			for (int c = 0; c < capacity; c++) {
				if (data[c] == null) {
					data[c] = element;
					count++;
				}
			}
		}
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		for (int c = index; c < data.length; c++) {
			if (count == capacity) {
				capacity += INITIALSIZE;
				E[] newData = (E[]) new Object[capacity];
				for (int i = 0; i < capacity; i++) {
					newData[i] = data[i];
				}
				data = newData;
			}
		}
		data[index] = element;
		count++;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for (int c = 0; c < capacity; c++) {
			data[c] = null;
		}
		count = 0;
	}

	@Override
	public boolean contains(E element) {
		// TODO Auto-generated method stub
		for (int c = 0; c < capacity; c++) {
			if (data[c] == element)
				return true;
		}
		return false;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		if (index < capacity)
			return data[index];
		else
			return null;
	}

	@Override
	public int indexOf(E element) {
		// TODO Auto-generated method stub
		//                                                                                                 for (int c)
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(E element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

}