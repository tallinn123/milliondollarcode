package lesson11_enums_oop.oop.assosiacion.composition;

public class Mouse {

    private Button leftButton; // there is association between mouse object and button object
                                // we could say that this association is a composition. Because there is part-of relation
    private Button rightButton;
    private Gear gear;

    public Button getLeftButton() {
        return leftButton;
    }

    public void setLeftButton(Button leftButton) {
        this.leftButton = leftButton;
    }

    public Button getRightButton() {
        return rightButton;
    }

    public void setRightButton(Button rightButton) {
        this.rightButton = rightButton;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }
}
