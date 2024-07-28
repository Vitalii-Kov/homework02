package app.code;

import app.staff.administration.Director;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    // Код без использования Spring

    public static void main(String[] args) {

       // Secretary secretary = new Secretary();
//
       // SalesManager salesManager = new SalesManager();
//
       // Merchendiser merchendiser = new Merchendiser();
//
       // MachineOperator machineOperator = new MachineOperator();
//
       // Storekeeper storekeeper = new Storekeeper();
//
       // ProductionChief productionChief = new ProductionChief();
       // productionChief.setMachineOperator(machineOperator);
       // productionChief.setStorekeeper(storekeeper);
//
       // SalesChief salesChief = new SalesChief();
       // salesChief.setMerchendiser(merchendiser);
       // salesChief.setSalesManager(salesManager);
//
       // Director director = new Director();
       // director.setSecretary(secretary);
       // director.setProductionChief(productionChief);
       // director.setSalesChief(salesChief);
//
       // director.manageCompany();

        //Вариант кода с использованием Spring
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        Director director = context.getBean(Director.class);
        director.manageCompany();
    }
}
