package cn.nstl.repository;

import cn.nstl.entity.SysNotify;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SysNotifyRepository extends JpaRepository<SysNotify, String> {

    int deleteByUserIdIn(List<String> userIdList);

    SysNotify findByUserId(String userId);
}
