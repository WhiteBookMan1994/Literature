package com.dxc.songci.model.mapper;

import com.dxc.songci.model.TbWriter;

import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface TbWriterMapper {
  /*  @Delete({
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

    @Select({
        "select",
        "id, name",
        "from tb_writer",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.dxc.songci.model.mapper.TbWriterMapper.BaseResultMap")
    TbWriter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbWriter record);

    @Update({
        "update tb_writer",
        "set name = #{name,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TbWriter record);*/

  /*  @Select({
            "select",
            "id, name",
            "from tb_writer",
            "where name = #{name,jdbcType=VARCHAR}"
    })
    @ResultMap("com.dxc.songci.model.mapper.TbWriterMapper.BaseResultMap")*/
    TbWriter selectByName(@Param("name") String name);
}