package com.example.backendone.configs;

import com.opentable.db.postgres.embedded.EmbeddedPostgres;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@Profile("db-embedded")
public class EmbeddedPostgresConfig {
    @Value("${embedded.port}")
    Integer port;

    @Bean
    DataSource dataSource() throws IOException {
        return EmbeddedPostgres.builder().setPort(port).start().getPostgresDatabase();
    }
}
