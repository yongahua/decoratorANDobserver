package gupao.vip.pattern.decorator.cake.v1;

public class CakeTest {
    public static void main(String[] args) {
        Cake cake = new Cake();
        System.out.println(cake.getMsg() + ",总价格：" + cake.getPrice());

        CakeWithChocolate cakeWithChocolate = new CakeWithChocolate();
        System.out.println(cakeWithChocolate.getMsg()+",总价："+cakeWithChocolate.getPrice());

        CakeWithChocolateAndBerries cakeWithChocolateAndBerries = new CakeWithChocolateAndBerries();
        System.out.println(cakeWithChocolateAndBerries.getMsg() +",总价："+cakeWithChocolateAndBerries.getPrice());

    }
}
