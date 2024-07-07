// Polymorphism is when there are multiple instances of inheritance rather than just one

class Product { // this is our super class
    public void Price() {
        System.out.println("The Product costs: ");
    }
}

class Bracelet extends Product {
    public void Price() {
        System.out.println("The Bracelet costs: £10.99");
    }
}

class Piano extends Product {
    public void Price() {
        System.out.println("The Piano costs: £74.99");
    }
}

class Main {
    public static void main(String[] args) {
        Product myProduct = new Product(); // Create a Product object
        Product myPiano = new Piano(); // Create a Piano object
        Product myBracelet = new Bracelet(); // Create a Bracelet object
        myProduct.Price();
        myPiano.Price();
        myBracelet.Price();
    }
}