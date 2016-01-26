/**
 * 
 */
package com.mk.race.app.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;

import com.mk.race.app.entity.Driver;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "driverrepo", path = "driverrepo")
public interface DriverRepository extends PagingAndSortingRepository<Driver, Long> {

	List<Driver> findByLastName(@Param("last_name") String lastName);

	List<Driver> findByLastName(String lastName, Pageable pageable);
	
	List<Driver> findByLastName(String lastName, Sort sort);	
	
	List<Driver> findByFirstName(String firstName);
	
	List<Driver> findByFirstNameAndLastName(String firstName, String lastName);
	
	@Query("select d from Driver d where d.firstName = ?1")
	List<Driver> findByFirstNameQuery(String firstName);
}
