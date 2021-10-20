package kodlama.io.hrms.core.adapters;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlama.io.hrms.core.utilies.results.DataResult;

public interface CloudinaryAdapterService {

	 @SuppressWarnings("rawtypes")
	 DataResult<Map> uploadImage(MultipartFile imageFile);
}
