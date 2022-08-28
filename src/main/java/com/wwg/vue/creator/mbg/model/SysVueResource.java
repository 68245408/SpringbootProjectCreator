package com.wwg.vue.creator.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class SysVueResource implements Serializable {
    /**
     * 主键ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 父id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     * 角色id
     *
     * @mbg.generated
     */
    private Long roleId;

    /**
     * 名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * url路径
     *
     * @mbg.generated
     */
    private String path;

    /**
     * 插入时间
     *
     * @mbg.generated
     */
    private Date insertTime;

    /**
     * 添加用户ID
     *
     * @mbg.generated
     */
    private Long insertUser;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 修改者ID
     *
     * @mbg.generated
     */
    private Long updateUser;

    /**
     * 版本号;用于更新时对比操作;
     *
     * @mbg.generated
     */
    private Long versions;

    /**
     * 是否逻辑删除;0:不删除;1:逻辑删除;所有查询sql都要带上del=0这个条件
     *
     * @mbg.generated
     */
    private String del;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Long getInsertUser() {
        return insertUser;
    }

    public void setInsertUser(Long insertUser) {
        this.insertUser = insertUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Long getVersions() {
        return versions;
    }

    public void setVersions(Long versions) {
        this.versions = versions;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", roleId=").append(roleId);
        sb.append(", name=").append(name);
        sb.append(", path=").append(path);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", insertUser=").append(insertUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", versions=").append(versions);
        sb.append(", del=").append(del);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}