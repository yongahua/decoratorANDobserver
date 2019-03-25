package gupao.vip.pattern.decorator.cake.v2;

public class BerriesDecorator extends CakeDecorator{
    @Override
    protected void doSomething() {

    }

    public BerriesDecorator(Cake cake) {
        super(cake);
    }

    @Override
    protected String getMsg() {
        return "草莓"+super.getMsg();
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+10;
    }
}
