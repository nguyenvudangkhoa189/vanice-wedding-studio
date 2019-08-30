package wedding.studio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wedding.studio.dao.model.ShowModel;
import wedding.studio.dao.repository.ShowRepository;
import wedding.studio.service.IShowService;

@Service
@Transactional
public class ShowService extends AbstractService<ShowModel, Integer> implements IShowService {

    private final ShowRepository showRepository;

    @Autowired
    public ShowService(ShowRepository showRepository) {
        super(showRepository);
        this.showRepository = showRepository;
    }

}
