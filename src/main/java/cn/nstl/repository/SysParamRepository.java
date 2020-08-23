package cn.nstl.repository;

import cn.nstl.entity.SysParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SysParamRepository extends JpaRepository<SysParam, String> {


    List<SysParam> findByIsDelAndNameOrCode(String isDel, String name, String code);

    List<SysParam> findAllByIsDel(String isDel);

    SysParam findByCode(String code);

    List<SysParam> findByPId(String pid);

}
