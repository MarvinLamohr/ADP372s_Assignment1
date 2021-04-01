package za.ac.cput.ADP372s_Assignment1;

/**

 * Student Name: MARVIN LAMOHR
 * Student Number: 214273830

 */

public class TestDrivenDevelopment {

    private String carBrand,carType,carColour;


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }


    @Override
    public String toString() {
        return "TestDrivenDevelopment{" +
                "carBrand='" + carBrand + '\'' +
                ", carType='" + carType + '\'' +
                ", carColour='" + carColour + '\'' +
                '}';
    }
}
