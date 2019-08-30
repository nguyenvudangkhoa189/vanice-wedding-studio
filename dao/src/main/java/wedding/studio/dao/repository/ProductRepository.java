package wedding.studio.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wedding.studio.dao.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

}
