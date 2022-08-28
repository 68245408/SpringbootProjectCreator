package com.wwg.vue.creator.mbg.mapper;

import com.wwg.vue.creator.mbg.model.SysVueResource;
import com.wwg.vue.creator.mbg.model.SysVueResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysVueResourceMapper {
    long countByExample(SysVueResourceExample example);

    int deleteByExample(SysVueResourceExample example);

    int insert(SysVueResource record);

    int insertSelective(SysVueResource record);

    List<SysVueResource> selectByExample(SysVueResourceExample example);

    int updateByExampleSelective(@Param("record") SysVueResource record, @Param("example") SysVueResourceExample example);

    int updateByExample(@Param("record") SysVueResource record, @Param("example") SysVueResourceExample example);
}