package org.example;

public abstract class NetworkService {
    public void handlerRequest(String request){
        establishConnect();
        if(authenticate())
            execute(request);
        closeConnection();
    };
    protected abstract void establishConnect();
    protected abstract boolean authenticate();
    protected abstract void execute(String request);
    protected abstract void closeConnection();
}
