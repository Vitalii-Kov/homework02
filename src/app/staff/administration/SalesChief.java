package app.staff.administration;

import app.staff.specialists.sales.Merchendiser;
import app.staff.specialists.sales.SalesManager;
import org.springframework.beans.factory.annotation.Autowired;

public class SalesChief {

    @Autowired
    private Merchendiser merchendiser;
    @Autowired
    private SalesManager salesManager;

    public void setMerchendiser(Merchendiser merchendiser) {
        this.merchendiser = merchendiser;
    }

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }

    public void giveOrders() {
        merchendiser.work();
        salesManager.work();
    }

}
