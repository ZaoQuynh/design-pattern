package org.example;

public class Main {
    public static void main(String[] args) {
        Handler directorHandler = new DirectorHandler();
        Handler managerHandler = new ManagerHandler();
        Handler salesHandler = new SalesHandler();

        salesHandler.setNext(managerHandler);
        managerHandler.setNext(directorHandler);

        OrderRequest order1 = new OrderRequest(150, "Order 1");
        OrderRequest order2 = new OrderRequest(250, "Order 2");
        OrderRequest order3 = new OrderRequest(700, "Order 3");
        OrderRequest order4 = new OrderRequest(1200, "Order 4");

        salesHandler.handlerRequest(order1);
        System.out.println("-----------------------");
        salesHandler.handlerRequest(order2);
        System.out.println("-----------------------");
        salesHandler.handlerRequest(order3);
        System.out.println("-----------------------");
        salesHandler.handlerRequest(order4);
    }
}