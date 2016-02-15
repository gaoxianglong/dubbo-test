package com.gxl.test.service.user;

/**
 * 用户服务接口实现
 * 
 * @author JohnGao
 */
public class UserServiceImpl implements UserService {
	@Override
	public boolean userLogin(String userAccount, String passWord) throws Exception {
		boolean result = false;
		if ("admin".equals(userAccount)) {
			if ("123456".equals(passWord)) {
				result = true;
			}
		}
		return result;
	}
}