package dsa;

public class Producto {
    private String name;
    private Integer value;

    public Producto(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {

        return name;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
