package gupao.vip.pattern.decorator.cake.v2;

public class BaseCakeTest {
    public static void main(String[] args) {
        Cake cake = new BaseCake();

        cake = new BerriesDecorator(cake);

        cake = new ChocolateDecorator(cake);

        cake = new MangoDecorator(cake);

        System.out.println(cake.getMsg() + ",总价：" + cake.getPrice());

    }
}
