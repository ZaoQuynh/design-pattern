package org.example.context;

import org.example.strategies.Path;

public class SelectThePath {
    private Path path;

    public void setPath(Path path) {
        this.path = path;
    }

    public void movingToDistance(){
        this.path.go();
    }

}
