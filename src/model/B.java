package model;

public class B extends A implements Cloneable{
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
