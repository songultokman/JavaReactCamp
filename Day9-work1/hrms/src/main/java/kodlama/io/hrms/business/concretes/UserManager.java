package kodlama.io.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.UserService;
import kodlama.io.hrms.core.dataAccess.UserDao;
import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
import kodlama.io.hrms.core.utilies.results.SuccessResult;

@Service
public class UserManager implements UserService{

	UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		
		return new SuccessDataResult<User>(this.userDao.findByEmail(email), "Kulllanıcı bulundu" );
	}

}

