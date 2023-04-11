package spring.mvc.data;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class testDao {

	@Autowired
	SqlSession session;
	
	public int count_test() {
		return session.selectOne("count_test");
	}
}
