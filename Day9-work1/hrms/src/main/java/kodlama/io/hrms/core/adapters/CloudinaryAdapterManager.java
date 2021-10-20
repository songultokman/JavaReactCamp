package kodlama.io.hrms.core.adapters;

import java.io.IOException;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.ErrorDataResult;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
@Service
public class CloudinaryAdapterManager implements CloudinaryAdapterService {

	
	private Cloudinary cloudinary;

	
	public CloudinaryAdapterManager() {
		
		 this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "songul",
				"api_key", "454494431821223",
				"api_secret", "BZ4BQhkajBXb_8_a6VB_zEz4W5M"));
	
	}

	@SuppressWarnings({"rawtypes" ,"unchecked"})
	@Override
	public DataResult<Map> uploadImage(MultipartFile imageFile) {
		try {
			
            Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());

            return new SuccessDataResult<Map>(resultMap);

        }
        catch (IOException exception) {
            exception.printStackTrace();

        }
        return new ErrorDataResult<Map>();
	}
}
