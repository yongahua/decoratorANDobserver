package gupao.vip.pattern.decorator.cake.v1;

public class CakeWithChocolateAndBerries extends CakeWithChocolate{
    @Override
    protected String getMsg() {
        return "草莓"+super.getMsg();
    }

    @Override
    public int getPrice() {
        return super.getPrice()+10;
    }
}
