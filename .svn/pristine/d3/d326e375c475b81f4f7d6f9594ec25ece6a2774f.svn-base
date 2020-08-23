package cn.nstl.repository;

import cn.nstl.entity.SysOrgan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SysOrganRepository extends JpaRepository<SysOrgan, String> {

    List<SysOrgan> findByPId(String pId);

    void deleteByTreeLevelIsStartingWith(String treeLevel);

    List<SysOrgan> findByNameOrCode(String name, String code);
}
