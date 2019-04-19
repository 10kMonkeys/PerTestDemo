package com.perchwell.helper.stepListener;

public class TestStepResult {

    private String name;
    private String result;
    private String message;

    /**
     * Default constructor
     */
    public TestStepResult() {

    }

    public TestStepResult(String name, String result, String message) {
        this.setName(name);
        this.setResult(result);
        this.setMessage(message);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override public String toString() {
        return "TestStepResult{" +
                "name='" + name + '\'' +
                ", result='" + result + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
