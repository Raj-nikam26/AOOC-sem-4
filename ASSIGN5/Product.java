package ASSIGN5;

public class Product {
        public String name;
        public double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public void displayProduct() {
            System.out.println("Product Name: " + name);
            System.out.println("Price: " + price);
        }

}
