package io.edurt.datacap.service.repository;

import io.edurt.datacap.service.entity.ScheduledEntity;
import io.edurt.datacap.service.entity.ScheduledHistoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ScheduledHistoryRepository
        extends PagingAndSortingRepository<ScheduledHistoryEntity, Long>
{
    Page<ScheduledHistoryEntity> findAllByScheduledOrderByIdDesc(ScheduledEntity scheduled, Pageable pageable);
}
