package io.edurt.datacap.service.service;

import io.edurt.datacap.common.response.CommonResponse;
import io.edurt.datacap.service.entity.DataSetColumnEntity;
import io.edurt.datacap.service.entity.DataSetEntity;

import java.util.Set;

public interface DataSetService
        extends BaseService<DataSetEntity>
{
    CommonResponse<DataSetEntity> saveOrUpdate(DataSetEntity configure);

    CommonResponse<DataSetEntity> rebuild(Long id);

    CommonResponse<Set<DataSetColumnEntity>> getColumns(Long id);

    CommonResponse<Boolean> syncData(Long id);
}
