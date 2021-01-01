Projects com.Projects.service.car;

import com.Projects.domainobject.CarDO;
import com.Projects.exception.CarAlreadyInUseException;
import com.Projects.exception.ConstraintsViolationException;
import com.Projects.exception.EntityNotFoundException;

public interface CarService {

    CarDO find(String licensePlate) throws EntityNotFoundException;

    CarDO create(CarDO carDO) throws ConstraintsViolationException;

    void delete(String licensePlate) throws EntityNotFoundException, ConstraintsViolationException;

    void addDriver(Long driverId, String licensePlate) throws ConstraintsViolationException, EntityNotFoundException, CarAlreadyInUseException;

    void deleteDriver(Long driverId, String licensePlate) throws ConstraintsViolationException, EntityNotFoundException, CarAlreadyInUseException;

    Iterable<CarDO> findAll();
}
