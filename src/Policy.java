import java.util.Objects;

public class Policy {
    private int idPolicy;


    public Policy(int idPolicy) {
        this.idPolicy = idPolicy;
    }
    

    public int getIdPolicy() {
        return this.idPolicy;
    }

    public void setIdPolicy(int idPolicy) {
        this.idPolicy = idPolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Policy)) {
            return false;
        }
        Policy policy = (Policy) o;
        return idPolicy == policy.idPolicy;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPolicy);
    }

    @Override
    public String toString() {
        return "{" +
            " idPolicy='" + getIdPolicy() + "'" +
            "}";
    }

}
