package com.example.mybatis.demoMybatis;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;


import junit.framework.Assert;

public class UserServiceTest {

//	private static UserService userService;
//	
//	 @BeforeClass
//	 public static void setup() {
//	 userService = new UserService();
//	 }
//	 @AfterClass
//	 public static void teardown() {
//	 userService = null;
//	 }
//	 @Test
//	 public void testGetByUserId() {
//	 User user = userService.getUserById(1);
//	 Assert.assertNotNull(user);
//	 System.out.println(user);
//	 }
//	 @Test
//	 public void testGetAllUsers() {
//	 List<User>users = userService.getAllUsers();
//	 Assert.assertNotNull(users);
//	 System.out.println(users);
//	 }
//	 @Test
//	 public void testInsertUser() {
//	 User user = new User();
//	 user.setEmailId("testEmail"+ System.currentTimeMillis()+"@gmail.com");
//	 user.setFirstName("Rocky");
//	 user.setLastName("Manalu");
//	 user.setPassword("secret");
//	
//	 userService.insertUser(user);
//	 Assert.assertTrue(user.getUserId() != 0);
//	 User createdUser = userService.getUserById(user.getUserId());
//	 Assert.assertNotNull(createdUser);
//	 Assert.assertEquals(user.getUserId(), createdUser.getUserId());
//	 Assert.assertEquals(user.getFirstName(), createdUser.getFirstName());
//	 Assert.assertEquals(user.getLastName(), createdUser.getLastName());
//	 Assert.assertEquals(user.getPassword(), createdUser.getPassword());
//	 Assert.assertEquals(user.getEmailId(), createdUser.getEmailId());
//	 }
}
