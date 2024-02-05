package demo.example.demopraco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ProductRepository extends JpaRepository<Product,Long> {
//List <Product> findAllByDateCreatedBetween(LocalDateTime startDate,LocalDateTime endDate);
}
