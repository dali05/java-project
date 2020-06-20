package p1;

public class Animal {

    private int id;
    private String name;
    private String color;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    /**
     * Sets new id.
     *
     * @param id New value of id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets id.
     *
     * @return Value of id.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new color.
     *
     * @param color New value of color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets color.
     *
     * @return Value of color.
     */
    public String getColor() {
        return color;
    }
}
