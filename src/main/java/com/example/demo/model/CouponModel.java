package com.example.demo.model;


import javax.persistence.*;

//pour que la Table soient cree automatique dans postgre
@Entity
@Table(name = "coupon")
public class CouponModel {

    //generation automatique de l'id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //creation automatique du au cas ou il n'excite pa sur la table
    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "reference")
    private String reference;

    @Column(name = "qr_url")
    private String qrCode;

    //les getters et les setters pour acceder au champs et ou les modifier
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
