package zhiren.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Solley
 * Created Time  2018/4/9.
 */
@Configuration
@PropertySource(value = { "classpath:zhiren.properties" })
public class ZhiRenConfig {
    @Value("${zhiren.name}")
    private String name;

    @Value("${zhiren.version}")
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}
