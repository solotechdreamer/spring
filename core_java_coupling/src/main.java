import house_loose_tight_coupling.GasCompany.BharathGasConnection;
import house_loose_tight_coupling.GasCompany.HPGasConnection;
import house_loose_tight_coupling.House;

/**
 * Main class to execute the project
 * */

public class main {
    public static void main(String[] args){




        /** Parameters send to create connection and check the type of coupling  */
        House connection = new House();

        House con = new House(new BharathGasConnection() );
        House hp = new House(new HPGasConnection());
    }
}
