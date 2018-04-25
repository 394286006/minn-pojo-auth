package p.minn.auth.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.auth.entity.Role;
import p.minn.auth.entity.RoleMenu;
import p.minn.common.annotation.LogAnnotation;
import p.minn.common.baseDao.BaseDao;
import p.minn.common.entity.IdEntity;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @comment 
 */
//@LogAnnotation(resourceKey="A000A002")
public interface RoleDao extends BaseDao<Role,IdEntity>{

	public void delRoleResource(@Param("roleid") String roleid);
	
	@LogAnnotation(resourceKey="role_save_role_resource")
	public void saveRoleResource(@Param("roleMenus") List<RoleMenu> roleMenus);

	public List<Map<String, Object>> getRoleResource(@Param("lang") String lang,@Param("roleid") String roleid);

	public int checkCode(@Param("code") String code);

	
}