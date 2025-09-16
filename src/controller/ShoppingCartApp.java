package controller;

import model.Product;
import service.CartService;

public class ShoppingCartApp {
    public static void main(String[] args) {
        CartService cartService = new CartService();

        Product p1 = new Product(1, "Laptop", 800);
        Product p2 = new Product(2, "Headphones", 50);
        Product p3 = new Product(3, "Mouse", 25);

        cartService.addProduct(p1, 1);
        cartService.addProduct(p2, 2);
        cartService.addProduct(p3, 1);

        System.out.println("Cart after adding products:");
        cartService.getCartItems().forEach(System.out::println);

        cartService.updateQuantity(2, 3);
        System.out.println("\nCart after updating quantity of Headphones:");
        cartService.getCartItems().forEach(System.out::println);

        cartService.removeProduct(3);
        System.out.println("\nCart after removing Mouse:");
        cartService.getCartItems().forEach(System.out::println);

        System.out.println("\nTotal Price: $" + cartService.calculateTotal());
    }
}
