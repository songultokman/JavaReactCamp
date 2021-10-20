package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;

public interface UserService {

	Result add(User user);
	DataResult<User> findByEmail(String email);
}
