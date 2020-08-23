package cn.nstl.repository;

import cn.nstl.entity.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SysRoleRepository extends JpaRepository<SysRole, String> {

    List<SysRole> findByName(String name);

    SysRole findByIdIsNotAndName(String id, String name);

}
