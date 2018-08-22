package com.dxc.model.mapper;

import com.dxc.model.TbWriter;
import com.dxc.model.TbWriterExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface TbWriterMapper {
    long countByExample(TbWriterExample example);

    int deleteByExample(TbWriterExample example);

    @Insert({
        "insert into tb_writer (name, birthday)",
        "values (#{name,jdbcType=VARCHAR}, #{birthday,jdbcType=VARCHAR})"
    })
    int insert(TbWriter record);

    int insertSelective(TbWriter record);

    List<TbWriter> selectByExample(TbWriterExample example);

    int updateByExampleSelective(@Param("record") TbWriter record, @Param("example") TbWriterExample example);

    int updateByExample(@Param("record") TbWriter record, @Param("example") TbWriterExample example);
}