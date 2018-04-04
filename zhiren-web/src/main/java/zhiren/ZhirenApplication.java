package zhiren;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("zhiren.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class ZhirenApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZhirenApplication.class, args);
    }

//    @Bean
//    public HttpMessageConverters fastjsonHttpMessageConverter(){
//        //定义一个转换消息的对象
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//
//        //添加fastjson的配置信息 比如 ：是否要格式化返回的json数据
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//
//        //在转换器中添加配置信息
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//
//        HttpMessageConverter<?> converter = fastConverter;
//
//        return new HttpMessageConverters(converter);
//
//    }
}
