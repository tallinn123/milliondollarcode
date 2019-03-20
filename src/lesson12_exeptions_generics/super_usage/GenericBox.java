package lesson12_exeptions_generics.super_usage;

public class GenericBox<T> {

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

