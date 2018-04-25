package p.minn.auth.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.auth.entity.Account;
import p.minn.auth.entity.AccountRole;
import p.minn.common.annotation.LogAnnotation;
import p.minn.common.baseDao.BaseDao;
import p.minn.common.entity.IdEntity;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @omment 
 */
//@LogAnnotation(resourceKey="A000A000")
public interface AccountDao extends BaseDao<Account,IdEntity>{

	public void delAccountRole(@Param("accountid") String accountid);

	@LogAnnotation(resourceKey="account_save_account_resource")
	public void saveAccountRole(@Param("accountRoles") List<AccountRole> accountRoles);

	public Account checkAccount(@Param("name") String name,@Param("pwd") String pwd);

	public Account findByLoginName(@Param("loginName") String loginName);

	public List<String> getAccountRoleList(@Param("id") Integer accountid);
	
	public List<String> getAccountRoleRealmList(@Param("accountid") Integer accountid);

	public Account getAccountById( @Param("account") Account account);
	
	public List<Map<String, Object>> getAccountRole(@Param("lang") String lang,
			@Param("condition")Map<String, String> condition);
	public void updateKey(@Param("name") String name,@Param("randomKey") String randomKey);
	
	public Account findByRandomKey(@Param("randomKey") String randomKey);
	
	public int checkQrCodeByRandomKey(@Param("randomKey") String randomKey);

    public Account findAccountById(@Param("accountId")Integer accountId);

}