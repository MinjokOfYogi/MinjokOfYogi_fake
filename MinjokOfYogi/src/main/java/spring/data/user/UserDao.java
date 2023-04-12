package spring.data.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	SqlSession session;

	public void insert_user(UserDto dto) {
		session.insert("insert_user", dto);
	}
}
