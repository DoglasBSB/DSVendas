package com.devsuperior.dsvendas.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*atributos da classe*/
    private Long id;
    private String name;

    @OneToMany(mappedBy = "seller")
    private List<Sale> sales = new ArrayList<>();

    /*construtor */
    public Seller() {
    }
    /*construtores auxiliares
     recebe os dados para ter a opção de estânciar os objetos*/
    public Seller (Long id, String name){
        this.id = id;
        this.name = name;
    }
    /*GET E SET OU LOMBOK */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Sale> getSales() {
        return sales;
    }
}
