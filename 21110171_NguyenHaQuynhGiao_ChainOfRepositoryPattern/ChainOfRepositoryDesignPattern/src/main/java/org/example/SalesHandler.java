package org.example;

public class SalesHandler implements Handler{
    private Handler next;
    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public Handler getNext() {
        return this.next;
    }

    @Override
    public void handlerRequest(OrderRequest orderRequest) {
        if (orderRequest.getAmount() <= 200) {
            System.out.println("Sales can approve the order.");
        } else if (this.next != null) {
            this.next.handlerRequest(orderRequest);
        } else {
            System.out.println("None of the handlers can approve the order.");
        }
    }
}
