package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

/*o objeto SellerRepository acessa os dados de um Seller*/
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
