package gupao.vip.pattern.decorator.cake.v2;

public class BaseCake extends Cake{
    @Override
    protected String getMsg() {
        return "蛋糕";
    }

    @Override
    protected int getPrice() {
        return 50;
    }

}
