package cn.nstl.dao;

import cn.nstl.entity.SysCover;
import cn.nstl.entity.SysParam;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface SysParamDao {

    List<SysParam> findByNameOrCodeAndIsNotId(SysParam sysParam);

    void deleteById(String id);

    void updateNameAndAndCodeById(SysParam sysParam);

    List<Map<String, Object>> findByPid(String pId);

    List<SysParam> getPublishList();

    List<SysParam> getCountryList();

    List<SysParam> getSubjectList();

    List<SysParam> getFrequencyList();

    List<SysParam> getCarrierList();

    List<SysParam> getLanguageList();

    List<SysCover> getCoverList();

    List<SysParam> getOrderTypeList();

    List<SysParam> getOrderingModeList();

    List<SysParam> getCurrencyList();

    List<SysParam> getOpenRangeList();

    List<SysParam> getStopReasonList();

    List<SysParam> getFundTypeList();

    List<SysParam> getAuditOpinionList();

}
