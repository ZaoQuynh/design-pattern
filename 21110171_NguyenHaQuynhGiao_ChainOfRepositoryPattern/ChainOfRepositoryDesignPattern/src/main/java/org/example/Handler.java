package org.example;

public interface Handler {
    void setNext(Handler next);
    Handler getNext();
    public void handlerRequest(OrderRequest orderRequest);
}
