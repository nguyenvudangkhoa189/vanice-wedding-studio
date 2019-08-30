package wedding.studio.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wedding.studio.dao.model.CategoryModel;

public interface CategoryRepository extends JpaRepository<CategoryModel, Integer> {

}
