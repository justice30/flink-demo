package com.jinlong.config.yaml;

import lombok.extern.slf4j.Slf4j;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class YamlConf {
    public List getYamlConf(String yamlPath){
        Yaml yaml = new Yaml();
        File file  = new File(yamlPath);
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            log.error("yaml异常");
        }
        List list = new ArrayList();
        Iterable<Object> o =  yaml.loadAll(inputStream);
        o.forEach(i->list.add(i));
        return list;
    }
}
