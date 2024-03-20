package vn.edu.iuh.fit.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.product.modules.Product;
import vn.edu.iuh.fit.product.repositories.ProductRepository;

@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
    @Autowired
    private ProductRepository productRepository;
    //@Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            for (int i = 1; i <= 10; i++) {
                Product product=new Product("Name #"+i,i+20000000);
                productRepository.save(product);
            }
        };
    }

}
