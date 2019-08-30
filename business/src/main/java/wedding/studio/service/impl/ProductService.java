package wedding.studio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wedding.studio.dao.model.ProductModel;
import wedding.studio.dao.repository.ProductRepository;
import wedding.studio.service.IProductService;

@Service
@Transactional
public class ProductService extends AbstractService<ProductModel, Integer> implements IProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }

}
