package com.zqhl.live.manager.po;


import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;

@Data
@Table(name = "sys_role")
public class SysRole {

    @Id
    @KeySql(useGeneratedKeys = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    @Column(name = "role_id",insertable = false,updatable = false)
    private Integer roleId;

    /**
     *角色名
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     *机构Id
     */
    @Column(name = "org_id")
    private Integer orgId;

    /**
     *创建时间
     */
    @Column(name = "create_time")
    private java.util.Date createTime;

    /**
     *创建人uid
     */
    @Column(name = "create_uid")
    private Integer createUid;

    /**
     *修改时间
     */
    @Column(name = "modify_time")
    private java.util.Date modifyTime;

    /**
     *修改人uid
     */
    @Column(name = "modify_uid")
    private Integer modifyUid;

    /**
     *删除标记(0:正常;1:删除)
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag;

    public static class ${
        public static String roleId="roleId";
        public static String roleName="roleName";
        public static String orgId="orgId";
        public static String createTime="createTime";
        public static String createUid="createUid";
        public static String modifyTime="modifyTime";
        public static String modifyUid="modifyUid";
        public static String deleteFlag="deleteFlag";
    }
}
