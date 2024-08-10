package org.example;

public class ManagerHandler implements Handler{
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
        if (orderRequest.getAmount() <= 500) {
            System.out.println("Manager can approve the order.");
        } else if (this.next != null) {
            this.next.handlerRequest(orderRequest);
        } else {
            System.out.println("None of the handlers can approve the order.");
        }
    }
}
