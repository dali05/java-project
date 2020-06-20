package p1;

public class Chien {
    private int id;
    private String color;

    public Chien(int id, String color) {
        this.id = id;
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

    /**
     * Sets new color.
     *
     * @param color New value of color.
     */
    public void setColor(String color) {
        this.color = color;
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
     * Sets new id.
     *
     * @param id New value of id.
     */
    public void setId(int id) {
        this.id = id;
    }
}
