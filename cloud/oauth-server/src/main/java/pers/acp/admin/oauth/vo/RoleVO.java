package pers.acp.admin.oauth.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangbin by 2018-1-17 16:53
 * @since JDK 11
 */
@ApiModel("角色详细信息")
public class RoleVO {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public List<String> getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(List<String> menuIds) {
        this.menuIds = menuIds;
    }

    public List<String> getModuleFuncIds() {
        return moduleFuncIds;
    }

    public void setModuleFuncIds(List<String> moduleFuncIds) {
        this.moduleFuncIds = moduleFuncIds;
    }

    @ApiModelProperty("角色ID")
    private String id;

    @ApiModelProperty(value = "应用ID", position = 1)
    private String appid;

    @ApiModelProperty(value = "角色名称", position = 2)
    private String name;

    @ApiModelProperty(value = "角色编码", position = 3)
    private String code;

    @ApiModelProperty(value = "角色级别", position = 4)
    private int levels = 1;

    @ApiModelProperty(value = "序号", position = 5)
    private int sort = 0;

    @ApiModelProperty(value = "关联用户ID", position = 5)
    private List<String> userIds = new ArrayList<>();

    @ApiModelProperty(value = "关联菜单ID", position = 6)
    private List<String> menuIds = new ArrayList<>();

    @ApiModelProperty(value = "关联模块功能ID", position = 7)
    private List<String> moduleFuncIds = new ArrayList<>();

}
