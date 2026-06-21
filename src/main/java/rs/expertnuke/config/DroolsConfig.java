package rs.expertnuke.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.kie.internal.io.ResourceFactory;

@Configuration
public class DroolsConfig {
    
    @Bean
    public KieContainer getKieContainer() {
        KieServices ks = KieServices.Factory.get();
        KieFileSystem kfs = ks.newKieFileSystem();
        kfs.write(ResourceFactory.newClassPathResource("rules/reactor-rules.drl"));
        ks.newKieBuilder(kfs).buildAll();
        return ks.newKieContainer(ks.getRepository().getDefaultReleaseId());
    }
}