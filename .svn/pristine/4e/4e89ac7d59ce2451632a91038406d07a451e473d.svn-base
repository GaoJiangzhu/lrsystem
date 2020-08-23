package cn.nstl.repository;

import cn.nstl.entity.AcountNum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SysAcountNumRepository extends JpaRepository<AcountNum, String> {

    int deleteByIdIn(List<String> list);

    AcountNum findByAcountNum(String acountNum);

    AcountNum findByAcountNumAndIdNot(String acountNum, String id);

    int findByProxyCorId(String proxyCorId);
}
