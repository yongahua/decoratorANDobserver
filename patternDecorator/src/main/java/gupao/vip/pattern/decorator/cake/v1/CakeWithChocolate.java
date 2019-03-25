package gupao.vip.pattern.decorator.cake.v1;

public class CakeWithChocolate extends Cake{
    @Override
    protected String getMsg() {
        return "巧克力"+super.getMsg();
    }

    @Override
    public int getPrice() {
        return super.getPrice()+20;
    }
}
