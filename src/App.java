import java.util.ArrayList;
import java.util.List;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        List<Contract> contracts = new ArrayList<Contract>(); 

       Home hotel = new Home(3, "via delle finanze", "A1", 5, 3333);
       Car fiat = new Car("Fiat", "Punto", 233, 32, "FC545CV", 3334);
       Life life = new Life("Arturo", "Tamburo", "23/4/1999", "male", "sdhjsdlhav", 3335);

       Contract bc44 = new Contract(hotel, 3333, "22/4/2020", "22/4/2022", 50.000);
       Contract bc45 = new Contract(fiat, 3334, "10/3/2020", "10/3/2022", 4000.0);
       Contract bc46 = new Contract(life, 3335, "17/6/2020", "17/6/2022", 90.000);
       
       Client mimmo = new Client("Mimmo", "Paoli", "9/5/1980", "male", "ahdahdha", contracts);

       contracts.add(bc44);
       contracts.add(bc45);
       contracts.add(bc46);

       int numberContractHome=0;
       int numberContractLife=0;
       int numberContractCar=0;

       for (Contract contract : contracts) {
           if( contract.getPolicy() instanceof Car ){
               numberContractCar++;
           } else if(contract.getPolicy() instanceof Home){
               numberContractHome++;
           }else if(contract.getPolicy() instanceof Life){
            numberContractLife++;
           }
       }
       System.out.println("Il cliente :" + mimmo.getName() + " " + mimmo.getSurname()+" "
        + "ha sotto il suo nome " + mimmo.getContracts().size() + " " + "contratti : "
        + numberContractHome + " " 
        + "casa" + " " + numberContractCar + " " + "Macchina" + " " + numberContractLife + " " + "vita");

        for (Contract contract : contracts) {
            System.out.println("La pratica n : " + contract.getContractNumber() + " " + "con la polizza : " + contract.getPolicy().toString());
        }
    }
}
