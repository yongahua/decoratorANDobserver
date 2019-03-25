package gupao.vip.pattern.decorator.cake.v2;

public class MangoDecorator extends CakeDecorator{

    public MangoDecorator(Cake cake) {
        super(cake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return "芒果"+super.getMsg();
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+20;
    }
}
