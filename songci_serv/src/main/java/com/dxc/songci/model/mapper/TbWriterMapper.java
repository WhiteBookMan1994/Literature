package com.dxc.songci.model.mapper;

import com.dxc.songci.model.TbWriter;
import com.dxc.songci.model.TbWriterExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TbWriterMapper {
    long countByExample(TbWriterExample example);

    int deleteByExample(TbWriterExample example);

    @Delete({
        "delete from tb_writer",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into tb_writer (id, name)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR})"
    })
    int insert(TbWriter record);

    int insertSelective(TbWriter record);

    List<TbWriter> selectByExample(TbWriterExample example);

    @Select({
        "select",
        "id, name",
        "from tb_writer",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.dxc.songci.model.mapper.TbWriterMapper.BaseResultMap")
    TbWriter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbWriter record, @Param("example") TbWriterExample example);

    int updateByExample(@Param("record") TbWriter record, @Param("example") TbWriterExample example);

    int updateByPrimaryKeySelective(TbWriter record);

    @Update({
        "update tb_writer",
        "set name = #{name,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TbWriter record);
}