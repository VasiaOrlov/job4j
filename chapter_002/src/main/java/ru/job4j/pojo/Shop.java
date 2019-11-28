package ru.job4j.pojo;

public class Shop {
    public Product[] delete(Product[] products, int index) {
        if (index < products.length) {
            products[index] = null;
        }
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
            products [i + 1] = null;
        }
        return products;

    }
    public static void main(String[] args) {
        Product milk = new Product("Milk", 2);
        Product apple = new Product("Apple", 3);
        Product banana = new Product("Banana", 10);
        Product[] products = new Product[5];
        products[0] = milk;
        products[1] = apple;
        products[2] = banana;
        Shop prod = new Shop();
        prod.delete(products, 2);
        for (Product temp : products) {
            if (temp != null) {
                System.out.println(temp.getName() + " - " + temp.getCount());
            } else {
                System.out.println("null");
            }
        }

     }
}
