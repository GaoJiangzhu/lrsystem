package cn.nstl.repository;

import cn.nstl.entity.ProxyCorporation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SysProxyCorationRepository extends JpaRepository<ProxyCorporation, String> {


    ProxyCorporation findByProxyCorCode(String proxyCorCode);

    ProxyCorporation findByProxyCorName(String proxyCorName);

    ProxyCorporation findByProxyCorCodeAndIdNot(String proxyCorCode, String id);

    ProxyCorporation findByProxyCorNameAndIdNot(String proxyCorName, String id);

    int deleteByIdIn(List<String> list);

    int deleteById(String id);
}
