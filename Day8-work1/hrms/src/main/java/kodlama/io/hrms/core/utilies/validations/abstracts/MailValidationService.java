package kodlama.io.hrms.core.utilies.validations.abstracts;

import kodlama.io.hrms.core.utilies.results.Result;

public interface MailValidationService {

	 Result Validate(String email);
}
