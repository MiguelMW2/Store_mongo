package mx.ipn.cic.store.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mx.ipn.cic.store.entities.UserEntity;

@Repository
public interface IUserRepository extends MongoRepository<UserEntity, String>{

	List<UserEntity> findByNameContaining(String name);

	List<UserEntity> findByLastnameContaining(String lastname);

	List<UserEntity> findByGivenNameContaining(String givenname);
}
