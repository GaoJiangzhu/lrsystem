package cn.nstl.repository;

import cn.nstl.entity.SysResourceInfo;
import cn.nstl.entity.SysResourceInfoRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: DongZeLiang
 * @Date: Created in 16:04 2018/8/2
 */
public interface SysResourceInfoRecordRepository extends JpaRepository<SysResourceInfoRecord,String>{
}
