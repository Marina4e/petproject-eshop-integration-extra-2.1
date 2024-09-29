package com.example.eshopforintegration.domain;

public class OrderDetails {
    private String product;
    private Double price;
    private Double amount;
    private Double sum;

    public OrderDetails(String product, Double price, Double amount, Double sum) {
        this.product = product;
        this.price = price;
        this.amount = amount;
        this.sum = sum;
    }

    public OrderDetails() {
    }

    public static OrderDetailsBuilder builder() {
        return new OrderDetailsBuilder();
    }

    public String getProduct() {
        return this.product;
    }

    public Double getPrice() {
        return this.price;
    }

    public Double getAmount() {
        return this.amount;
    }

    public Double getSum() {
        return this.sum;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderDetails other)) return false;
        if (!other.canEqual((Object) this)) return false;
        final Object this$product = this.getProduct();
        final Object other$product = other.getProduct();
        if (this$product == null ? other$product != null : !this$product.equals(other$product)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        final Object this$sum = this.getSum();
        final Object other$sum = other.getSum();
        return this$sum == null ? other$sum == null : this$sum.equals(other$sum);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderDetails;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $product = this.getProduct();
        result = result * PRIME + ($product == null ? 43 : $product.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final Object $sum = this.getSum();
        result = result * PRIME + ($sum == null ? 43 : $sum.hashCode());
        return result;
    }

    public String toString() {
        return "OrderDetails(product=" + this.getProduct() + ", price=" + this.getPrice() + ", amount=" + this.getAmount() + ", sum=" + this.getSum() + ")";
    }

    public static class OrderDetailsBuilder {
        private String product;
        private Double price;
        private Double amount;
        private Double sum;

        OrderDetailsBuilder() {
        }

        public OrderDetailsBuilder product(String product) {
            this.product = product;
            return this;
        }

        public OrderDetailsBuilder price(Double price) {
            this.price = price;
            return this;
        }

        public OrderDetailsBuilder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        public OrderDetailsBuilder sum(Double sum) {
            this.sum = sum;
            return this;
        }

        public OrderDetails build() {
            return new OrderDetails(this.product, this.price, this.amount, this.sum);
        }

        public String toString() {
            return "OrderDetails.OrderDetailsBuilder(product=" + this.product + ", price=" + this.price + ", amount=" + this.amount + ", sum=" + this.sum + ")";
        }
    }
}
