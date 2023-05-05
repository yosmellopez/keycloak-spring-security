package org.ylplabs.keycloak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ylplabs.keycloak.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
