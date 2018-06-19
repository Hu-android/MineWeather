package hjl.mineweather.util;

public class ApiManager {

    private static final String HTTP = "http://";
    private static final String GUOLIN = "guolin.tech";
    private static final String HOST = HTTP + GUOLIN;
    private static final String API = "/api";
    private static final String CHINA = "/china";

    public static final String ProvinceApi = HOST + API + CHINA;
    public static final String CityApi = HOST + API + CHINA + "/";
}
