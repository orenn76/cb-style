package com.cbstyle.common.crudcore.controller;

import com.cbstyle.common.crudcore.responses.DtoResponse;
import com.cbstyle.common.crudcore.responses.IdResponse;
import com.cbstyle.common.crudcore.responses.ListResponse;

public interface CrudController<DTO> {

    IdResponse create(DTO dto);

    DtoResponse<DTO> read(long id);

    ListResponse<DTO> readAll();

    void update(long id, DTO dto);

}