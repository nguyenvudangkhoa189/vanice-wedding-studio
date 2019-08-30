package wedding.studio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wedding.studio.dao.model.UserModel;
import wedding.studio.dao.repository.UserRepository;
import wedding.studio.service.IUserService;

@Service
@Transactional
public class UserService extends AbstractService<UserModel, Integer> implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

}
