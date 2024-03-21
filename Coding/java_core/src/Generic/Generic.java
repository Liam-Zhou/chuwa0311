package src.Generic;

public class Generic<T>{
    T obj;
    public Generic(T obj){
        this.obj = obj;
    }
    public T getObj(){
        return this.obj;
    }
}
