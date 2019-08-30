package wedding.studio.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wedding.studio.dao.model.CustomerModel;

public interface EmployeeRepository extends JpaRepository<CustomerModel, Integer> {

}
