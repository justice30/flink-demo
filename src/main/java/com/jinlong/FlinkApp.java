package com.jinlong;

import com.jinlong.config.yaml.YamlConf;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author jinlong
 */
@Slf4j
public class FlinkApp {
    public static void main(String[] args) {
        log.info("app启动");
        YamlConf yamlConf = new YamlConf();
        String yamlPath = "classpath:application.yml";
        List list = yamlConf.getYamlConf(yamlPath);
        list.forEach(i->log.info("{}",i));
    }
}
