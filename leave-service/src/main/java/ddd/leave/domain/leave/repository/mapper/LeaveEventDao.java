package ddd.leave.domain.leave.repository.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ddd.leave.domain.leave.repository.po.LeaveEventPO;

@Repository
public interface LeaveEventDao extends JpaRepository<LeaveEventPO, String> {

}
