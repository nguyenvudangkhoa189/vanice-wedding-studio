package wedding.studio.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wedding.studio.dao.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
