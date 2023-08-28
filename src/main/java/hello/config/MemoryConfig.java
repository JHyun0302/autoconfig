package hello.config;

import memory.MemoryController;
import memory.MemoryFinder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 시나리오 : memory 패키지는 외부 라이브러리라고 생각, hello 패키지에서 가져다 쓰기
 */
@Configuration
//@Conditional(MemoryCondition.class) //true가 되야 @Bean 등록됨!
@ConditionalOnProperty(name = "memory", havingValue = "on") //-Dmemory=on 같은 설정
public class MemoryConfig {

    @Bean
    public MemoryController memoryController() {
        return new MemoryController(memoryFinder());
    }

    @Bean
    public MemoryFinder memoryFinder() {
        return new MemoryFinder();
    }

}
