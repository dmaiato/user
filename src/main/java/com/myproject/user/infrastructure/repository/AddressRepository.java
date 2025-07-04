package com.myproject.user.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.myproject.user.infrastructure.entity.Address;

// toda tablea (entity) precisa de um repository
// o repository é uma interface que estende JpaRepository
// JpaRepository<Entidade, Tipo do ID>
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
