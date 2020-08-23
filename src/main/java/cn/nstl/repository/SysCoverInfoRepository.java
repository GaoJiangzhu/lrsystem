package cn.nstl.repository;

import cn.nstl.entity.SysCover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface SysCoverInfoRepository extends JpaRepository<SysCover, String> {


    @Transactional
    @Modifying
    @Query("update SysCover set isDel=:isDel where id=:id")
    void updateIsDelById(@Param("isDel") String isDel, @Param("id") String id);
}
