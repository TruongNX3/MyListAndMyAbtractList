public abstract class MyAbtractList<E> implements MyList<E> {
    protected int size = 0;

    protected MyAbtractList() {

    }

    protected MyAbtractList(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            add(i, objects[i]);
        }
    }

    @Override
    public void add(E e) {
        add(size, e);
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean remove(E e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else {
            return false;
        }
    }
}
