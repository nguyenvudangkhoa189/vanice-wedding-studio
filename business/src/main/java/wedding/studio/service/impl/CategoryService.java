package wedding.studio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wedding.studio.dao.model.CategoryModel;
import wedding.studio.dao.repository.CategoryRepository;
import wedding.studio.service.ICategoryService;

@Service
@Transactional
public class CategoryService extends AbstractService<CategoryModel, Integer> implements ICategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        super(categoryRepository);
        this.categoryRepository = categoryRepository;
    }

}
