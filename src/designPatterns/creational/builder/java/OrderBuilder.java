package designPatterns.creational.builder.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderBuilder {
    private int order_id;
    private float total_price;
    private List<String> order_items;
    private List<Float> order_prices;

    private OrderBuilder(Order order) {
        this.order_id = order.order_id;
        this.order_items = Collections.unmodifiableList(order.order_items);
        this.order_prices = Collections.unmodifiableList(order.order_prices);
        this.total_price = order.total_price;
    }

    static class Order {
        private int order_id;
        private float total_price;
        private List<String> order_items;
        private List<Float> order_prices;

        public Order() {
            this.order_items = new ArrayList<>();
            this.order_prices = new ArrayList<>();
        }

        public Order add_item(String item, float price) {
            this.order_items.add(item);
            this.order_prices.add(price);
            update_total_prices();
            return this;
        }

        private void update_total_prices() {
            float sum = 0;
            for (float price : this.order_prices) {
                sum += price;
            }
            this.total_price = sum;
        }

        public OrderBuilder build() {
            return new OrderBuilder(this);
        }

    }

    public int getOrder_id() {
        return order_id;
    }

    public float getTotal_price() {
        return total_price;
    }

    public List<String> getOrder_items() {
        return order_items;
    }

    public List<Float> getOrder_prices() {
        return order_prices;
    }
}
