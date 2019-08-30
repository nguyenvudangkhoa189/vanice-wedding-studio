package wedding.studio.service;

import java.util.List;

import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import wedding.studio.dao.model.UserModel;

@Transactional
public class UserServiceTest extends AbstractServiceTests {

    @Test
    public void testFindAll() {
        List<UserModel> users = userService.findAll();

        System.out.println("Size = " + users.size());
    }
}
