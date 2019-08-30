package wedding.studio.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import wedding.studio.dao.repository.CategoryRepository;
import wedding.studio.dao.repository.EmployeeRepository;
import wedding.studio.dao.repository.ProductRepository;
import wedding.studio.dao.repository.ServiceRepository;
import wedding.studio.dao.repository.ShowRepository;
import wedding.studio.dao.repository.SizeRepository;
import wedding.studio.dao.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class AbstractDAOTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected CategoryRepository categoryRepository;

    @Autowired
    protected EmployeeRepository employeeRepository;

    @Autowired
    protected ProductRepository productRepository;

    @Autowired
    protected ServiceRepository serviceRepository;

    @Autowired
    protected ShowRepository showRepository;

    @Autowired
    protected SizeRepository sizeRepository;

    @Autowired
    protected UserRepository userRepository;

    @Test
    @Rollback(false)
    public void contextLoads() {
    }

}
