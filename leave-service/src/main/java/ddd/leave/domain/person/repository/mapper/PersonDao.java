package ddd.leave.domain.person.repository.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ddd.leave.domain.person.repository.po.PersonPO;

@Repository
public interface PersonDao extends JpaRepository<PersonPO, String> {

    @Query(value = "select p from PersonPO  p where p.relationshipPO.personId=?1")
    PersonPO findLeaderByPersonId(String personId);
}
