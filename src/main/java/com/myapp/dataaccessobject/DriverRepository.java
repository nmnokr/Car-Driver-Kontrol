package com.Projects.dataaccessobject;

import com.Projects.domainobject.DriverDO;
import com.Projects.domainvalue.OnlineStatus;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Database Access Object for driver table.
 * <p/>
 */
public interface DriverRepository extends CrudRepository<DriverDO, Long>
{

    List<DriverDO> findByOnlineStatus(OnlineStatus onlineStatus);
}
