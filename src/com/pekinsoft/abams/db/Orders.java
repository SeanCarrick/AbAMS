/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.abams.db;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long orderID;
    private Date orderDate;
    private Date promiseDate;
    private Date shipDate;
    private Addresses billingAddressID;
    private Addresses shippingAddressID;
    private Customers customerID;
    private Collection<OrderDetails> orderDetailsCollection;

    public Orders () {

    }

    public Orders(Long orderID) {
        this.orderID = orderID;
    }

    public Orders(Long orderID, Date orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getPromiseDate() {
        return promiseDate;
    }

    public void setPromiseDate(Date promiseDate) {
        this.promiseDate = promiseDate;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Addresses getBillingAddressID() {
        return billingAddressID;
    }

    public void setBillingAddressID(Addresses billingAddressID) {
        this.billingAddressID = billingAddressID;
    }

    public Addresses getShippingAddressID() {
        return shippingAddressID;
    }

    public void setShippingAddressID(Addresses shippingAddressID) {
        this.shippingAddressID = shippingAddressID;
    }

    public Customers getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customers customerID) {
        this.customerID = customerID;
    }

    public Collection<OrderDetails> getOrderDetailsCollection() {
        return orderDetailsCollection;
    }

    public void setOrderDetailsCollection(Collection<OrderDetails> orderDetailsCollection) {
        this.orderDetailsCollection = orderDetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pekinsoft.abams.db.Orders[ orderID=" + orderID + " ]";
    }

}
