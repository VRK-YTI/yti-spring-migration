package fi.vm.yti.migration;

public interface SchemaVersionAccessor {

    boolean isInitialized() throws InitializationException;
    void initialize();
    int getSchemaVersion();
    void setSchemaVersion(int version);
}
