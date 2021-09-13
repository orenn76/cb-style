package com.cbstyle.common.crudcore.service;

import com.cbstyle.common.crudcore.model.BaseEntity;

import java.util.List;

public interface CrudService<DTO, ENTITY extends BaseEntity> {

    long create(DTO dto);

    DTO read(long id);

    List<DTO> readAll();

    void update(long id, DTO dto);

}
