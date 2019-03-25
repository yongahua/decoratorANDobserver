package gupao.vip.pattern.decorator.cake.v2;

public class ChocolateDecorator extends  CakeDecorator{


    @Override
    protected void doSomething() {

    }

    public ChocolateDecorator(Cake cake) {
        super(cake);
    }

    @Override
    protected String getMsg() {
        return "巧克力"+super.getMsg();
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+20;
    }
}
