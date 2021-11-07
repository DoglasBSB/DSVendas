package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

/*o objeto SellerRepository acessa os dados de um Seller*/
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
