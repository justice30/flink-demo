
### FLINK 学习200问 
https://www.cnblogs.com/zhisheng/p/11254773.html

### windows 启动 flink

bin/start-cluster.bat

### windows启动显示task solt为0 问题是因为taskManager（TM）没能启动，查看日志flink-jinlong-taskmanager没启动原因是因为没配置参数

rest.port: 8081
web.submit.enable: true
###windows启动下面参数必须要有
taskmanager.cpu.cores: 2
taskmanager.memory.task.heap.size: 1gb
taskmanager.memory.managed.size: 64mb
taskmanager.memory.network.min: 64m
taskmanager.memory.network.max: 64m

### 两个参数必须相等不然异常
taskmanager.memory.network.min
taskmanager.memory.network.max

###flink-conf.yaml配置文件

rest.port: 8081
web.submit.enable: true
taskmanager.cpu.cores: 2
taskmanager.memory.task.heap.size: 1gb
taskmanager.memory.managed.size: 64mb
taskmanager.memory.network.min: 64m
taskmanager.memory.network.max: 64m
web.upload.dir: /tmp/flink-web/flink-web-upload-dir

restart-strategy: fixed-delay
restart-strategy.fixed-delay.attempts: 10
restart-strategy.fixed-delay.delay: 15s

metrics.reporter.promgateway.class: org.apache.flink.metrics.prometheus.PrometheusPushGatewayReporter
metrics.reporter.promgateway.host: localhost
metrics.reporter.promgateway.port: 9091
metrics.reporter.promgateway.jobName: myJob
metrics.reporter.promgateway.randomJobNameSuffix: true
metrics.reporter.promgateway.deleteOnShutdown: false


### pom.xml依赖
