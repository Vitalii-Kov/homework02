package app.staff.administration;

import app.staff.specialists.Secretary;
import org.springframework.beans.factory.annotation.Autowired;

public class Director {
    @Autowired
    private Secretary secretary;
    @Autowired
    private SalesChief salesChief;
    @Autowired
    private ProductionChief productionChief;

    public void setSecretary (Secretary secretary) {
        this.secretary = secretary;
    }

    public void setSalesChief (SalesChief salesChief) {
        this.salesChief = salesChief;
    }

    public void setProductionChief (ProductionChief productionChief) {
        this.productionChief = productionChief;
    }

    public void manageCompany() {
        secretary.work();
        salesChief.giveOrders();
        productionChief.giveOrders();
    }
}
