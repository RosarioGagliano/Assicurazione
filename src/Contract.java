import java.util.Objects;

public class Contract {
    private Policy policy;
    private int contractNumber;
    private String signatureDate;
    private String endDate;
    private Double cost;

    public Contract(Policy policy, int contractNumber, String signatureDate, String endDate, Double cost) {
        this.policy = policy;
        this.contractNumber = contractNumber;
        this.signatureDate = signatureDate;
        this.endDate = endDate;
        this.cost = cost;
    }

    public Policy getPolicy() {
        return this.policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public int getContractNumber() {
        return this.contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getSignatureDate() {
        return this.signatureDate;
    }

    public void setSignatureDate(String signatureDate) {
        this.signatureDate = signatureDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contract)) {
            return false;
        }
        Contract contract = (Contract) o;
        return Objects.equals(policy, contract.policy) && contractNumber == contract.contractNumber && Objects.equals(signatureDate, contract.signatureDate) && Objects.equals(endDate, contract.endDate) && Objects.equals(cost, contract.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy, contractNumber, signatureDate, endDate, cost);
    }


    @Override
    public String toString() {
        return "{" +
            " policy='" + getPolicy() + "'" +
            ", contractNumber='" + getContractNumber() + "'" +
            ", signatureDate='" + getSignatureDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            ", cost='" + getCost() + "'" +
            "}";
    }
    
}
