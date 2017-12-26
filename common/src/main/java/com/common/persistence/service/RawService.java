package com.common.persistence.service;

import java.io.Serializable;
import java.util.List;

public interface RawService<T extends Serializable> {


    /**
     * - contract: if nothing is found, an empty list will be returned to the calling client <br>
     */
    List<T> findAll(final long id);

 

}
