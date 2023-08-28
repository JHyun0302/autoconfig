package hello.selector;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

public class ImportSelectorTest {

    @Test
    void staticConfig() {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(staticConfig.class);
        HelloBean bean = appContext.getBean(HelloBean.class);
        assertThat(bean).isNotNull();
    }

    @Test
    void selectorConfig() {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SelectorConfig.class);
        HelloBean bean = appContext.getBean(HelloBean.class);
        assertThat(bean).isNotNull();
    }

    @Configuration
    @Import(HelloConfig.class) //@Configuration을 이용한 정적인 설정 정보 적용
    public static class staticConfig {
    }

    @Configuration
    @Import(HelloImportSelector.class) //프로그래밍 방식의 설정 정보
    public static class SelectorConfig {
    }


}
