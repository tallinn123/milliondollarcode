package lesson12_exeptions_generics.generics.basics;

public class GenericBox<T> {    // T is an object

    T item;
    public GenericBox(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
