package cn.nstl.repository;

import cn.nstl.entity.SysModule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SysModuleRepository extends JpaRepository<SysModule, String>{

    public List<SysModule> findSysModuleByTreeLevelStartsWithAndLevelIsNot(String treeLevel,Integer level);

    public SysModule findByTreeLevelEqualsAndLevelEquals(String treeLevel, Integer level);

    public List<SysModule> findByParentId(String parentId);

    public List<SysModule> findByLevel(Integer level);

    List<SysModule> findByParentIdOrderByOrderNumDesc(String parentId);
}
