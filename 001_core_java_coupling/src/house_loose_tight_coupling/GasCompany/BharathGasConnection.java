package house_loose_tight_coupling.GasCompany;

import house_loose_tight_coupling.service.LpgConnection;

public class BharathGasConnection implements LpgConnection {
    @Override
    public String Connection() {
        return "Bharath Gas connection establlished";
    }
}
