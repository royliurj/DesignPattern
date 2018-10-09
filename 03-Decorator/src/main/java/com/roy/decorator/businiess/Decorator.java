package com.roy.decorator.businiess;

public abstract class Decorator extends Component {

    protected Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
