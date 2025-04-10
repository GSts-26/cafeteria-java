package modelos.Bd;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

public class CloudinaryConfig {
    private static volatile CloudinaryConfig instance;
    private static Cloudinary cloudinary;

    private CloudinaryConfig() {
        long startTime = System.currentTimeMillis();

        cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "ddc47jehx",
            "api_key", "154771117917672",
            "api_secret", "HnTeJ6oI9zTirPJd560vtpN0tiQ"
        ));

        long endTime = System.currentTimeMillis();
        System.out.println("Cloudinary initialized in " + (endTime - startTime) + " ms");
    }

    public static Cloudinary getInstance() {
        if (instance == null) {
            synchronized (CloudinaryConfig.class) {
                if (instance == null) {
                    instance = new CloudinaryConfig();
                }
            }
        }
        return cloudinary;
    }
    
   
}
