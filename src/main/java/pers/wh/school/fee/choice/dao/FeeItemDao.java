package pers.wh.school.fee.choice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pers.wh.school.fee.choice.entity.FeeItem;

@Repository
public interface FeeItemDao extends JpaRepository<FeeItem,Long> {
}
