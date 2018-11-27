package org.fasttrackit.fitness.persistence;

import org.fasttrackit.fitness.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends
        PagingAndSortingRepository<User, Long> {



}
