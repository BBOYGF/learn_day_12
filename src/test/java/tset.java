import com.learn.dao.UserDao;
import com.learn.pojo.User;
import com.learn.utils.mSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class tset {
    @Test
    public void test()
    {
        SqlSession sqlSession= mSqlSessionFactory.getSqlSessionFactory();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> allUser = mapper.getAllUser();
        for(User user: allUser )
        {
            System.out.println(user.toString());
        }

        sqlSession.close();

    }
}
