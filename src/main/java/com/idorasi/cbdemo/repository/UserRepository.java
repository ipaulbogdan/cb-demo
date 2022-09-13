package com.idorasi.cbdemo.repository;

import com.idorasi.cbdemo.model.User;
import org.springframework.data.couchbase.repository.Collection;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends CouchbaseRepository<User, UUID> {

    Optional<User> findById(UUID id);
    Optional<User> findByEmail(String email);
}
