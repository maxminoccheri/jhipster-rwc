package com.maxminoccheri.rwc;

import com.maxminoccheri.rwc.RemoteWorkCommApp;
import com.maxminoccheri.rwc.config.AsyncSyncConfiguration;
import com.maxminoccheri.rwc.config.EmbeddedElasticsearch;
import com.maxminoccheri.rwc.config.EmbeddedKafka;
import com.maxminoccheri.rwc.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { RemoteWorkCommApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
