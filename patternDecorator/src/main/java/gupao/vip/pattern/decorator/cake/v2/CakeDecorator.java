package gupao.vip.pattern.decorator.cake.v2;

public abstract class CakeDecorator extends BaseCake{

    private Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.cake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.cake.getPrice();
    }
}
