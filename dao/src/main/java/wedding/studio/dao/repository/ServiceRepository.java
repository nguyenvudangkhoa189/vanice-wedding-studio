package wedding.studio.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wedding.studio.dao.model.ServiceModel;

public interface ServiceRepository extends JpaRepository<ServiceModel, Integer> {

}
