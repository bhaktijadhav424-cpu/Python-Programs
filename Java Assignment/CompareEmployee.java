class Product {

    private String productName;
    private int productId;
    private double unitPrice;
    private int quantity;

    
    Product(String productName, int productId, double unitPrice, int quantity) {

        this.productName = productName;
        this.productId = productId;

        if (unitPrice > 0) {
            this.unitPrice = unitPrice;
        } else {
            this.unitPrice = 0;
        }

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    
    double calculateSubtotal() {
        return unitPrice * quantity;
    }

    
    double calculateDiscount() {

        double subtotal = calculateSubtotal();
        double discount = 0;

        if (subtotal >= 10000) {
            discount = 15;
        } else if (subtotal >= 5000) {
            discount = 10;
        } else if (subtotal >= 1000) {
            discount = 5;
        } else {
            discount = 0;
        }

        return subtotal * discount / 100;
    }

    
    double calculateFinalBill() {
        return calculateSubtotal() - calculateDiscount();
    }

    
    void display() {

        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Subtotal: " + calculateSubtotal());
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Bill: " + calculateFinalBill());
    }

    public static void main(String[] args) {

        Product p = new Product("Keyboard", 501, 2000, 3);

        p.display();
    }
}

//Employee Name: Amit
//Employee ID: 105
//Monthly Salary: 50000.0
//Annual Salary: 600000.0
//Annual Bonus: 90000.0
//Total Annual Compensation: 690000.0