package wedding.studio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wedding.studio.dao.model.ServiceModel;
import wedding.studio.dao.repository.ServiceRepository;
import wedding.studio.service.IServiceService;

@Service
@Transactional
public class ServiceService extends AbstractService<ServiceModel, Integer> implements IServiceService {

    private final ServiceRepository serviceRepository;

    @Autowired
    public ServiceService(ServiceRepository serviceRepository) {
        super(serviceRepository);
        this.serviceRepository = serviceRepository;
    }

}
