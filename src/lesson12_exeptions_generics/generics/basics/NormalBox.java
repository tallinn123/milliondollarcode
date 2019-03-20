package lesson12_exeptions_generics.generics.basics;

public class NormalBox {

    private Object item;

    public NormalBox(Object item){
        this.item=item;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
