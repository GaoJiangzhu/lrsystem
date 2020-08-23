package cn.nstl.repository;

import cn.nstl.entity.SysOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Wuhongjie
 * @Date: Created in 15:01 2018/8/8
 */
public interface SysDataMaintainRepository extends JpaRepository<SysOrder,String> {
}
