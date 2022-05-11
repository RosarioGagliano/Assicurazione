import java.util.Objects;

public class Car extends Policy {
    private String brand;
    private String template;
    private int displacement;
    private int power;
    private String licencePlate;


    public Car(String brand, String template, int displacement, int power, String licencePlate,int idPolicy) {
        super(idPolicy);
        this.brand = brand;
        this.template = template;
        this.displacement = displacement;
        this.power = power;
        this.licencePlate = licencePlate;
    }
  

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTemplate() {
        return this.template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public int getDisplacement() {
        return this.displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getLicencePlate() {
        return this.licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(template, car.template) && displacement == car.displacement && power == car.power && Objects.equals(licencePlate, car.licencePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, template, displacement, power, licencePlate);
    }

    @Override
    public String toString() {
        return "{" +
            " brand='" + getBrand() + "'" +
            ", template='" + getTemplate() + "'" +
            ", displacement='" + getDisplacement() + "'" +
            ", power='" + getPower() + "'" +
            ", licencePlate='" + getLicencePlate() + "'" +
            "}";
    }

}
