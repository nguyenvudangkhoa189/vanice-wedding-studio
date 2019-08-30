package wedding.studio.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import wedding.studio.dao.model.UserModel;

@Transactional
public class UserDaoTest extends AbstractDAOTest {

    @Test
    @Rollback(false)
    public void testFindAll() {
        List<UserModel> users = userRepository.findAll();

        System.out.println("Size = " + users.size());
    }
}
