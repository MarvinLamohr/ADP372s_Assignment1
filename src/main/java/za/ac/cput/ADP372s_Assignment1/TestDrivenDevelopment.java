package za.ac.cput.ADP372s_Assignment1;
/**
 * Asive Madladla
 * 217068332
 * Date 24/03/2021
 */
public class TestDrivenDevelopment {
private String id,name;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestDrivenDevelopment{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
