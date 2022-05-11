import java.util.List;
import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private String dateOfBoarn;
    private String gender;
    private String fiscalCode;
    List<Contract> contracts;

    public Client(String name, String surname, String dateOfBoarn, String gender, String fiscalCode, List<Contract> contracts) {
        this.name = name;
        this.surname = surname;
        this.dateOfBoarn = dateOfBoarn;
        this.gender = gender;
        this.fiscalCode = fiscalCode;
        this.contracts = contracts;
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBoarn() {
        return this.dateOfBoarn;
    }

    public void setDateOfBoarn(String dateOfBoarn) {
        this.dateOfBoarn = dateOfBoarn;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFiscalCode() {
        return this.fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public List<Contract> getContracts() {
        return this.contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client)) {
            return false;
        }
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(dateOfBoarn, client.dateOfBoarn) && Objects.equals(gender, client.gender) && Objects.equals(fiscalCode, client.fiscalCode) && Objects.equals(contracts, client.contracts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBoarn, gender, fiscalCode, contracts);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", surname='" + getSurname() + "'" +
            ", dateOfBoarn='" + getDateOfBoarn() + "'" +
            ", gender='" + getGender() + "'" +
            ", fiscalCode='" + getFiscalCode() + "'" +
            ", contracts='" + getContracts() + "'" +
            "}";
    }

}
