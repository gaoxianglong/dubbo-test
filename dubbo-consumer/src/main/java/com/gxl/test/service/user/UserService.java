package com.gxl.test.service.user;

/**
 * 用户服务接口
 * 
 * @author JohnGao
 */
public interface UserService {
	/**
	 * 用户登录验证
	 * 
	 * @author JohnGao
	 */
	public boolean userLogin(String userAccount, String passWord) throws Exception;
}