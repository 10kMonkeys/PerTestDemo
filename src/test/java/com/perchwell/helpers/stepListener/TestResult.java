package com.perchwell.helpers.stepListener;

import java.util.HashMap;
import java.util.Map;

public class TestResult {

    private boolean failed;
    private String message;
    private String reportFilePath;
    private String className;
    private boolean reported = false;
    private Map<Integer, TestStepResult> stepResults;
    /**
     * Default constructor
     */
    public TestResult() {

    }

    public TestResult(boolean failed, String message, String reportFilePath) {
        this.failed = failed;
        this.message = message;
        this.reportFilePath = reportFilePath;
    }

    /**
     * @return the failed
     */
    public boolean isFailed() {
        return failed;
    }
    /**
     * @param failed the failed to set
     */
    public void setFailed(boolean failed) {
        this.failed = failed;
    }
    /**
     * @return the message
     */
    public String getMessage() {
        if (message == null) {
            message = "";
        }
        return message;
    }
    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    /**
     * @return the reportFile
     */
    public String getReportFilePath() {
        return reportFilePath;
    }
    /**
     * @param reportFile the reportFile to set
     */
    public void setReportFilePath(String reportFile) {
        this.reportFilePath = reportFile;
    }

    /**
     * @return the stepResults
     */
    public Map<Integer, TestStepResult> getStepResults() {
        if (stepResults == null) {
            stepResults = new HashMap<Integer, TestStepResult>();
        }
        return stepResults;
    }

    /**
     *
     */
    public void cleanStepResults() {
        this.getStepResults().clear();
    }

    /**
     *
     */
    public void addStepResult(int order, TestStepResult result) {
        this.getStepResults().put(order, result);
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return the reported
     */
    public boolean isReported() {
        return reported;
    }

    /**
     * @param reported the reported to set
     */
    public void isReported(boolean reported) {
        this.reported = reported;
    }

    @Override public String toString() {
        return "TestResult{" +
                "failed=" + failed +
                ", message='" + message + '\'' +
                ", reportFilePath='" + reportFilePath + '\'' +
                ", className='" + className + '\'' +
                ", reported=" + reported +
                ", stepResults=" + stepResults +
                '}';
    }
}
