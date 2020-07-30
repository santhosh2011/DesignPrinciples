package designPatterns.creational.builder.java;

import java.util.List;

public class BuilderTest {
    public static void main(String[] args) {
        //
        OrderBuilder ob =
                (new OrderBuilder.Order()).add_item("Order 1", 10.3f).add_item("order 2", 12.4f).build();
        List<Float> li = ob.getOrder_prices();
//    li.add(123.0f);
        System.out.println(li);
        System.out.println(ob.getTotal_price());
    }
}
