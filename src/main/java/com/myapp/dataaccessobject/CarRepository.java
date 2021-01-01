package com.Projects.dataaccessobject;

import com.Projects.domainobject.CarDO;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<CarDO, String> {

    CarDO findByLicensePlate(String licensePlate);
}
