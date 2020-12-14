/**
 * @autor Chekmarev Andrey
 * 3rd year, 7th group
 * @version 1.0
 * Class of Human entity
 */

public class Human {

    /** ID field */
    private String ID;

    /** Name field */
    private String name;

    /** Gender field */
    private String gender;

    /** Birth date field */
    private String birtDate;

    /** Division field */
    private Division division;

    /** Salary field */
    private String salary;

    /**
     * toString-method
     */
    public String toString() {
        return ("ID: " + ID + ", " + name + ", " + gender + ", " + birtDate  + ", " + division.toString() + ", Salary: " + salary);
    }

    /**
     * Simplified toString-method
     */
    public String toStringWithoutDivisionID() {
        return ("ID: " + ID + ", " + name + ", " + gender + ", " + birtDate  + ", " + division.getName() + ", Salary: " + salary);
    }

    /**
     * Getter/Setter methods
     */
    public String getID() {
        return ID;
    }

    public void setID(String id) {
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(String birtDate) {
        this.birtDate = birtDate;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
