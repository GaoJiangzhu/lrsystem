package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.SysParam;

import java.util.List;
import java.util.Map;

public interface ParamService {
    Response save(SysParam sysParam);

    SysParam findById(String id);

    Response del(String id);

    List<SysParam> findParaList();

    List<SysParam> findByCode(String code);

    List<Map<String, Object>> getByCode(String code);

    Response getOptionValue();

    Response getAuditOpinion();
}
