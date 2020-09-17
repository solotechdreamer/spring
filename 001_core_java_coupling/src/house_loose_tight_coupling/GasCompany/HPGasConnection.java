package house_loose_tight_coupling.GasCompany;

import house_loose_tight_coupling.service.LpgConnection;

public class HPGasConnection implements LpgConnection {
    @Override
    public String Connection() {
        return "HP Gas connection established";
    }
}
