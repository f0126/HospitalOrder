package com.woniu.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm.SaltStyle;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class RootConfig {
	@Bean
	public DruidDataSource dataSource() {
		DruidDataSource ds=new DruidDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/hospitalorder?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	@Bean
	public HashedCredentialsMatcher hcm() {
		HashedCredentialsMatcher hcm=new HashedCredentialsMatcher();
		hcm.setHashAlgorithmName("md5");
		hcm.setHashIterations(10);
		return hcm;
	}
	@Bean
	public JdbcRealm realm() {
		JdbcRealm realm=new JdbcRealm();
		realm.setDataSource(dataSource());
		realm.setAuthenticationQuery("select password, salt from users where username = ?");
		realm.setUserRolesQuery("SELECT rname FROM u_r ur JOIN users u ON ur.`uid` = u.`uid` JOIN roles r ON ur.`rid` = r.`rid` WHERE username = ?");
		realm.setPermissionsQuery("SELECT pname FROM r_p rp JOIN roles r ON rp.rid = r.`rid` JOIN permissions p ON rp.pid = p.pid WHERE rname = ?");
		realm.setPermissionsLookupEnabled(true);
		realm.setCredentialsMatcher(hcm());
		realm.setSaltStyle(SaltStyle.COLUMN);
		return realm;
	}
	@Bean
	public DefaultWebSecurityManager securityManager() {
		DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
		securityManager.setRealm(realm());
		return securityManager;
	}
	@Bean
	public ShiroFilterFactoryBean shiroFilter() {
		ShiroFilterFactoryBean shiroFilter=new ShiroFilterFactoryBean();
		shiroFilter.setLoginUrl("/admin/login.jsp");
		shiroFilter.setUnauthorizedUrl("/admin/unauthorized.jsp");
		shiroFilter.setSecurityManager(securityManager());
		Map<String, String> map=new HashMap<String, String>();
		map.put("/logout", "logout");
		map.put("/admin/login.jsp", "anon");
		map.put("/users/login", "anon");
		map.put("/admin/css/**", "anon");
		map.put("/admin/js/**", "anon");
		map.put("/admin/images/**", "anon");
		map.put("/admin/webfonts/**", "anon");
		map.put("/admin/assets/**", "anon");
		map.put("/**", "authc");
		shiroFilter.setFilterChainDefinitionMap(map);
		return shiroFilter;
	}
	@Bean
	public AuthorizationAttributeSourceAdvisor aasa() {
		AuthorizationAttributeSourceAdvisor aasa=new AuthorizationAttributeSourceAdvisor();
		aasa.setSecurityManager(securityManager());
		return aasa;
	}
}
