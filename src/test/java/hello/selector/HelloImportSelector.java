package hello.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 설정 정보를 동적으로 선택 : if문 넣어서 조건에 따라 어떤 설정 정보를 return 할 지 지정 가능
 * cf.@Import() : 정적 선택 (컴파일 시점에 고르면 설정 정보 못 바꿈)
 */
public class HelloImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"hello.selector.HelloConfig"};
    }
}
