package com.ruoyi.web.mapper;

import java.util.List;
import com.ruoyi.web.domain.MuseumTag;

/**
 * 标签Mapper接口
 * 
 * @author keloid
 * @date 2024-02-19
 */
public interface MuseumTagMapper 
{
    /**
     * 查询标签
     * 
     * @param tagId 标签主键
     * @return 标签
     */
    public MuseumTag selectMuseumTagByTagId(Long tagId);

    /**
     * 查询标签列表
     * 
     * @param museumTag 标签
     * @return 标签集合
     */
    public List<MuseumTag> selectMuseumTagList(MuseumTag museumTag);

    /**
     * 新增标签
     * 
     * @param museumTag 标签
     * @return 结果
     */
    public int insertMuseumTag(MuseumTag museumTag);

    /**
     * 修改标签
     * 
     * @param museumTag 标签
     * @return 结果
     */
    public int updateMuseumTag(MuseumTag museumTag);

    /**
     * 删除标签
     * 
     * @param tagId 标签主键
     * @return 结果
     */
    public int deleteMuseumTagByTagId(Long tagId);

    /**
     * 批量删除标签
     * 
     * @param tagIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMuseumTagByTagIds(Long[] tagIds);
}
