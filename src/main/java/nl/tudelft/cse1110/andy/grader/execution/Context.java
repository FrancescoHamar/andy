package nl.tudelft.cse1110.andy.grader.execution;

import nl.tudelft.cse1110.andy.grader.config.DirectoryConfiguration;
import nl.tudelft.cse1110.andy.grader.config.RunConfiguration;

import java.util.List;

public class Context {

    private final ClassLoader cleanClassloader;
    private DirectoryConfiguration directoryConfiguration = null;
    private RunConfiguration runConfiguration = null;
    private long startTime;
    private List<String> fullClassNames;

    public Context() {
        this.cleanClassloader = Thread.currentThread().getContextClassLoader();
        this.startTime = System.nanoTime();
    }

    public DirectoryConfiguration getDirectoryConfiguration() {
        return directoryConfiguration;
    }

    public RunConfiguration getRunConfiguration() {
        return runConfiguration;
    }

    public void setDirectoryConfiguration(DirectoryConfiguration directoryConfiguration) {
        this.directoryConfiguration = directoryConfiguration;
    }

    public void setRunConfiguration(RunConfiguration runConfiguration) {
        this.runConfiguration = runConfiguration;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public ClassLoader getCleanClassloader() {
        return cleanClassloader;
    }

    public void setNewClassNames(List<String> fullClassNames) {
        this.fullClassNames = fullClassNames;
    }

    public List<String> getNewClassNames() {
        return fullClassNames;
    }
}