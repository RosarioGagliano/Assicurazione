import java.util.Objects;

public class Life extends Policy {
    private String nameLife;
    private String surnameLife;
    private String dateLife;
    private String genderLife;
    private String fiscalCodeLife;
    

    public Life(String nameLife, String surnameLife, String dateLife, String genderLife, String fiscalCodeLife,int idPolicy) {
        super(idPolicy);
        this.nameLife = nameLife;
        this.surnameLife = surnameLife;
        this.dateLife = dateLife;
        this.genderLife = genderLife;
        this.fiscalCodeLife = fiscalCodeLife;
    }


    public String getNameLife() {
        return this.nameLife;
    }

    public void setNameLife(String nameLife) {
        this.nameLife = nameLife;
    }

    public String getSurnameLife() {
        return this.surnameLife;
    }

    public void setSurnameLife(String surnameLife) {
        this.surnameLife = surnameLife;
    }

    public String getDateLife() {
        return this.dateLife;
    }

    public void setDateLife(String dateLife) {
        this.dateLife = dateLife;
    }

    public String getGenderLife() {
        return this.genderLife;
    }

    public void setGenderLife(String genderLife) {
        this.genderLife = genderLife;
    }

    public String getFiscalCodeLife() {
        return this.fiscalCodeLife;
    }

    public void setFiscalCodeLife(String fiscalCodeLife) {
        this.fiscalCodeLife = fiscalCodeLife;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Life)) {
            return false;
        }
        Life life = (Life) o;
        return Objects.equals(nameLife, life.nameLife) && Objects.equals(surnameLife, life.surnameLife) && Objects.equals(dateLife, life.dateLife) && Objects.equals(genderLife, life.genderLife) && Objects.equals(fiscalCodeLife, life.fiscalCodeLife);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameLife, surnameLife, dateLife, genderLife, fiscalCodeLife);
    }

    @Override
    public String toString() {
        return "{" +
            " nameLife='" + getNameLife() + "'" +
            ", surnameLife='" + getSurnameLife() + "'" +
            ", dateLife='" + getDateLife() + "'" +
            ", genderLife='" + getGenderLife() + "'" +
            ", fiscalCodeLife='" + getFiscalCodeLife() + "'" +
            "}";
    }

}
