package cn.nstl.repository;

import cn.nstl.entity.SysOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysOrderRepository extends JpaRepository<SysOrder, String> {
}
