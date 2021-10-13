package repository;

import org.springframework.stereotype.Repository;

@Repository 	
public interface PetRepository extends CrudRepository<PetEntity,Object> {

}
