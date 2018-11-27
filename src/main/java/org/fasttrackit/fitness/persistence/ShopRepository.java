package org.fasttrackit.fitness.persistence;

import org.fasttrackit.fitness.domain.Shop;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShopRepository
        extends
        PagingAndSortingRepository<Shop, Long> {



}
