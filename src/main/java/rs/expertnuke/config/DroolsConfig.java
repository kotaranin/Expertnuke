package rs.expertnuke.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.kie.internal.io.ResourceFactory;

@Configuration
public class DroolsConfig {
    
    @Bean
    public KieContainer getKieContainer() {
        System.setProperty("drools.programmatic.model", "false");
        KieServices ks = KieServices.Factory.get();
        KieFileSystem kfs = ks.newKieFileSystem();
        kfs.write("src/main/resources/rs/expertnuke/rules/reactor-rules.drl", 
                  ResourceFactory.newClassPathResource("rules/reactor-rules.drl"));
        KieBuilder kb = ks.newKieBuilder(kfs);
        kb.buildAll(org.drools.compiler.kie.builder.impl.DrlProject.class);
        return ks.newKieContainer(ks.getRepository().getDefaultReleaseId());
    }
}