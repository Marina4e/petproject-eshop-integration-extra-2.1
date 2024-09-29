package com.example.eshopforintegration.domain;

import java.util.List;

public class Order {
    private long orderId;
    private String username;
    private String address;
    private List<OrderDetails> details;

    public Order(long orderId, String username, String address, List<OrderDetails> details) {
        this.orderId = orderId;
        this.username = username;
        this.address = address;
        this.details = details;
    }

    public Order() {
    }

    public long getOrderId() {
        return this.orderId;
    }

    public String getUsername() {
        return this.username;
    }

    public String getAddress() {
        return this.address;
    }

    public List<OrderDetails> getDetails() {
        return this.details;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDetails(List<OrderDetails> details) {
        this.details = details;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Order)) return false;
        final Order other = (Order) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getOrderId() != other.getOrderId()) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$details = this.getDetails();
        final Object other$details = other.getDetails();
        if (this$details == null ? other$details != null : !this$details.equals(other$details)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Order;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $orderId = this.getOrderId();
        result = result * PRIME + (int) ($orderId >>> 32 ^ $orderId);
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $details = this.getDetails();
        result = result * PRIME + ($details == null ? 43 : $details.hashCode());
        return result;
    }

    public String toString() {
        return "Order(orderId=" + this.getOrderId() + ", username=" + this.getUsername() + ", address=" + this.getAddress() + ", details=" + this.getDetails() + ")";
    }
}
