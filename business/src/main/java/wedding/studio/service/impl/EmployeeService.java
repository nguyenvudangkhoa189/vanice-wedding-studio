package wedding.studio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wedding.studio.dao.model.CustomerModel;
import wedding.studio.dao.repository.EmployeeRepository;
import wedding.studio.service.IEmployeeService;

@Service
@Transactional
public class EmployeeService extends AbstractService<CustomerModel, Integer> implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        super(employeeRepository);
        this.employeeRepository = employeeRepository;
    }

}
