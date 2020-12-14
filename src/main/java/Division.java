/**
 * @autor Chekmarev Andrey
 * 3rd year, 7th group
 * @version 1.0
 * Class of Division entity
 */

import java.util.UUID;

public class Division {

    /** ID field */
    private UUID ID;

    /** Name field */
    private String name;

    /**
     * Division constructor
     * @param name - name of division
     */
    public Division(String name) {
        this.ID = UUID.randomUUID();
        this.name = name;
    }

    /**
     * toString-method
     */
    public String toString() {
        return ("(Division: " + name + ", " + ID + ")");
    }

    /**
     * Getter/Setter methods
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
