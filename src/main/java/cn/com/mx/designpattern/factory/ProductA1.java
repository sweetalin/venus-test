package cn.com.mx.designpattern.factory;

public class ProductA1 implements AbstractProductA {
	@Override
    public String doSomething() {
        String clsName = this.getClass().getName();
        System.out.println(clsName + " doSomething");
        return clsName;
    }
}

