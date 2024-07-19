package fi.vm.yti.migration;

import jakarta.annotation.PostConstruct;

public class MigrationInitializer {

    private final Migration migration;
    private final boolean enabled;

    MigrationInitializer(Migration migration, MigrationProperties properties) {
        this.migration = migration;
        this.enabled = properties.isEnabled();
    }

    @PostConstruct
    public void onInit() {
        if (enabled) {
            migration.migrate();
        }
    }
}
