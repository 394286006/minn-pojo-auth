package p.minn.auth.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.auth.entity.Department;
import p.minn.common.baseDao.BaseDao;
import p.minn.common.entity.IdEntity;
import p.minn.vo.MyUserDetails;


/**
 * 
 * @author minn
 * @QQ:3942986006
 * @comment 
 */
//@LogAnnotation(resourceKey="A000A001")
public interface DepartmentDao extends BaseDao<Department,IdEntity>{


	public List<Map<String,Object>> getPrivateMenu(@Param("lang") String lang,@Param("user") MyUserDetails user);

	public List<Map<String,Object>> getResource(@Param("lang") String lang);
	
	public Integer checkCode(@Param("code") String code);
	
	 public List<Department> getDepartmentByAcountId(@Param("accountid") Integer accountid);

}