package bean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ApplicationScoped
public class AppDetailBean implements Serializable{

    private String appName;
    private String version;

    @PostConstruct
    public void init() {
        this.appName = "Test CDI";
        this.version = "1.0";
    }

    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }

}
