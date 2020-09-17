package house_loose_tight_coupling;

import house_loose_tight_coupling.GasCompany.BharathGasConnection;
import house_loose_tight_coupling.service.LpgConnection;

import java.util.logging.LoggingPermission;

public class House {

    private LpgConnection connection;
    public House() {
        //1. Here 'Bharath Gas is tightly coupled'
        BharathGasConnection connection = new BharathGasConnection();
        System.out.println("House tightly: " + connection);
    }

    //2. Here Bharath Gas is loosely couples as we are sending object whenever we need
    public House(LpgConnection connection) {
        this.connection = connection;
        System.out.println("House loose: " + this.connection);
        System.out.println("New Gas: "+connection.Connection());
    }

}
