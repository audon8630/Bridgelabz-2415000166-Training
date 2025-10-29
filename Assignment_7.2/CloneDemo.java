class Prototype implements Cloneable {
    private String name;
    private int version;

    public Prototype(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported");
        }
    }

    public void display() {
        System.out.println("Model: " + name + " | Version: " + version);
    }
}

public class CloneDemo {
    public static void main(String[] args) {
        Prototype original = new Prototype("EngineModel", 1);
        Prototype clone = original.clone();

        System.out.println("Original ");
        original.display();

        System.out.println("Clone ");
        clone.display();
    }
}
