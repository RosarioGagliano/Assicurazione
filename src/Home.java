import java.util.Objects;

public class Home extends Policy {
   
    private int id;
    private String address;
    private String casale;
    private int roomsNumbers;

    public Home(int id, String address, String casale, int roomsNumbers,int idPolicy) {
        super(idPolicy);
        this.id = id;
        this.address = address;
        this.casale = casale;
        this.roomsNumbers = roomsNumbers;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCasale() {
        return this.casale;
    }

    public void setCasale(String casale) {
        this.casale = casale;
    }

    public int getRoomsNumbers() {
        return this.roomsNumbers;
    }

    public void setRoomsNumbers(int roomsNumbers) {
        this.roomsNumbers = roomsNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Home)) {
            return false;
        }
        Home home = (Home) o;
        return id == home.id && Objects.equals(address, home.address) && Objects.equals(casale, home.casale) && roomsNumbers == home.roomsNumbers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, casale, roomsNumbers);
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", address='" + getAddress() + "'" +
            ", casale='" + getCasale() + "'" +
            ", roomsNumbers='" + getRoomsNumbers() + "'" +
            "}";
    }

   

    
}
