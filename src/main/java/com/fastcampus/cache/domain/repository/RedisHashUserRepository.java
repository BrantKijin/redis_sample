package com.fastcampus.cache.domain.repository;

import org.springframework.data.repository.CrudRepository;
import com.fastcampus.cache.domain.entity.RedisHashUser;

public interface RedisHashUserRepository extends CrudRepository<RedisHashUser, Long> {
}