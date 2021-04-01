package za.ac.cput.ADP372s_Assignment1;

/**
 * @author Ian Louw - 216250773
 *
 * This is a simple identity application
 */

public class identity {
    private String name, surname;
    private int stdNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public int getStdNumber() {

        return stdNumber;
    }

    public void setStdNumber(int stdNumber) {

        this.stdNumber = stdNumber;
    }

    @Override
    public String toString() {
        return "identity{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", stdNumber=" + stdNumber +
                '}';
    }
}
