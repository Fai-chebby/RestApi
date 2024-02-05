package demo.example.demopraco.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DataJpaTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void saveMethod(){
        // CREATE PRODUCT
        Product product =new Product();
        product.setName("product 1");
        product.setDescription("product 1 description");
        product.setSku("100ACB");
        product.setPrice(new BigDecimal(100));
        product.setActive(true);
        product.setImageUrl("product1.png");
        //save product
       Product savedObject= productRepository.save(product);


       //display product info
        System.out.println(savedObject.getId());
        System.out.println(savedObject.toString());

    }


}