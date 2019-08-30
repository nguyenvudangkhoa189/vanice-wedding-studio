package wedding.studio.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import wedding.studio.service.impl.CategoryService;
import wedding.studio.service.impl.EmployeeService;
import wedding.studio.service.impl.ProductService;
import wedding.studio.service.impl.ServiceService;
import wedding.studio.service.impl.ShowService;
import wedding.studio.service.impl.SizeService;
import wedding.studio.service.impl.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class AbstractServiceTests {

    @Autowired
    protected CategoryService categoryService;

    @Autowired
    protected EmployeeService employeeService;

    @Autowired
    protected ProductService productService;

    @Autowired
    protected ServiceService serviceService;

    @Autowired
    protected ShowService showService;

    @Autowired
    protected SizeService sizeService;

    @Autowired
    protected UserService userService;
}
