package spring.data.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	SqlSession session;

	public int count_user() {
		return session.selectOne("count_user");
	}
}
