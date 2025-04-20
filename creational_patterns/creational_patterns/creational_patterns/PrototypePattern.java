package creational_patterns;

abstract class DeskPrototype implements Cloneable {
    protected String type;

    abstract void use();

    public DeskPrototype clone() {
        DeskPrototype clone = null;
        try {
            clone = (DeskPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class QuietDesk extends DeskPrototype {
    public QuietDesk() {
        this.type = "QuietDesk";
    }

    public void use() {
        System.out.println("Using Quiet Desk");
    }
}
