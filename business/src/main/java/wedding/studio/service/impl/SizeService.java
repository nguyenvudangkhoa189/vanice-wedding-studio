package wedding.studio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wedding.studio.dao.model.SizeModel;
import wedding.studio.dao.repository.SizeRepository;
import wedding.studio.service.ISizeService;

@Service
@Transactional
public class SizeService extends AbstractService<SizeModel, Integer> implements ISizeService {

    private final SizeRepository sizeRepository;

    @Autowired
    public SizeService(SizeRepository sizeRepository) {
        super(sizeRepository);
        this.sizeRepository = sizeRepository;
    }

}
