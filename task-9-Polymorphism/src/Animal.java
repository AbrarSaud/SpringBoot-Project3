public abstract class Animal {
    protected String animal;

    public Animal() {
    }
    public abstract String speak();
    public String toString() {
        return "I am a " + animal + " and I go " + speak();
    }
}