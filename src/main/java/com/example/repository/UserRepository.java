package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.to.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	public User findByUsernameAndPassword(String username, String password);
	
	public User findByFirstName(String firstName);
}




//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//import com.example.db.DBUtils;
//import com.example.to.User;

//public class UserRepository {
//	
//	public User validateUser(String username, String password) throws Exception {
//		
//		Connection conn = DBUtils.getConnection();
//		
//		PreparedStatement pstmt = conn.prepareStatement("select * from user where username = ? and password = ?");
//		
//		pstmt.setString(1, username);
//		pstmt.setString(2, password);
//		
//		ResultSet rs = pstmt.executeQuery();
//		
//		if(rs.next()) {
//			String uname = rs.getString(1);
//			String pwd = rs.getString(2);
//			String firstName = rs.getString(3);
//			String lastName = rs.getString(4);
//			String email = rs.getString(5);
//			
//			User user = new User(username, password, firstName, lastName, email);
//			return user;
//		}
//		else {
//			return null;
//		}
//	}
//
//}
