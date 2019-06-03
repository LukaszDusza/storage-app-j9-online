package akademia.configs;

import org.springframework.beans.factory.annotation.Value;

public class Constans {
    public static final String TABLE_NAME = "files";

    /* local files*/
    public static String CONTEXT_FILE_PATH = "";

    @Value("${file.local.path}")
    public static String LOCAL_FILE_PATH;

    /*API*/
    public static final String FILES = "/api/v1/files";
    public static final String DOWNLOAD_PATH = FILES + "/download/";
    public static final String DELETE_PATH = FILES + "/delete/";
    public static final String UPLOAD_PATH = FILES + "/upload";
}
