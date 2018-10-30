package com.perchwell.helpers.stepListener;

import com.perchwell.SampleTest;
import com.perchwell.helpers.SlackMessageBuilder;
import net.thucydides.core.model.DataTable;
import net.thucydides.core.model.Story;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.steps.ExecutedStepDescription;
import net.thucydides.core.steps.StepEventBus;
import net.thucydides.core.steps.StepFailure;
import net.thucydides.core.steps.StepListener;
import org.apache.commons.lang3.StringUtils;
import java.util.Map;

public class StepTestListener implements StepListener {

    private TestResult testResult;
    private int order;

    public StepTestListener(TestResult result) {
        super();
        testResult = result;
        order = 0;
    }

    @Override
    public void testSuiteStarted(Class<?> aClass) {
    }

    @Override
    public void testSuiteStarted(Story story) {
    }

    @Override
    public void testSuiteFinished() {

    }

    @Override
    public void testStarted(String s) {
    }

    @Override
    public void testStarted(String s, String s1) {
    }

    @Override
    public void stepStarted(ExecutedStepDescription executedStepDescription) {
        if (getCurrentStepresult() != null &&
                StringUtils.isEmpty(getCurrentStepresult().getResult())) {
            getCurrentStepresult().setResult("2");
        }
        addNewStep(executedStepDescription.getTitle());
    }

    @Override
    public void testFinished(TestOutcome testOutcome) {

        if (SampleTest.listener != null) {
            StepEventBus.getEventBus().dropListener(SampleTest.listener);
        }

        if (getCurrentStepresult() != null
                && StringUtils.isEmpty(getCurrentStepresult().getResult())) {
            getCurrentStepresult().setResult("2");
        }
    }

    @Override
    public void testRetried() {

    }

    @Override
    public void skippedStepStarted(ExecutedStepDescription executedStepDescription) {
    }

    @Override
    public void stepFailed(StepFailure stepFailure) {
        getCurrentStepresult().setResult("2");
        getCurrentStepresult().setMessage(stepFailure.getMessage());
    }

    @Override
    public void lastStepFailed(StepFailure stepFailure) {

    }

    @Override
    public void stepIgnored() {
        addNewStep("", "-1");
    }

    @Override
    public void stepPending() {
    }

    @Override
    public void stepPending(String s) {
    }

    @Override
    public void stepFinished() {
        if (StringUtils.isEmpty(getCurrentStepresult().getResult())) {
            getCurrentStepresult().setResult("1");
        }
    }

    @Override
    public void testFailed(TestOutcome testOutcome, Throwable throwable) {
        if (getCurrentStepresult() != null &&
                StringUtils.isEmpty(getCurrentStepresult().getResult())) {
            getCurrentStepresult().setResult("2");
        }

        SlackMessageBuilder slack = new SlackMessageBuilder();
        slack.buildMessage(String.valueOf(testOutcome.getTestCase()), testOutcome.getErrorMessage(), String.valueOf(testOutcome.getFailingStep()));
    }

    @Override
    public void testIgnored() {
    }

    @Override
    public void testSkipped() {
    }

    @Override
    public void testPending() {
    }

    @Override
    public void testIsManual() {
    }

    @Override
    public void notifyScreenChange() {
    }

    @Override
    public void testRunFinished() {
    }

    @Override
    public void useExamplesFrom(DataTable dataTable) {
    }

    @Override
    public void addNewExamplesFrom(DataTable dataTable) {
    }

    @Override
    public void exampleStarted(Map<String, String> map) {
    }

    @Override
    public void exampleFinished() {
    }

    @Override
    public void assumptionViolated(String s) {
    }

    /**
     *
     */
    public void addNewStep(String name) {
        addNewStep(name, "");
    }
    /**
     *
     */
    public void addNewStep(String name, String result) {
        order++;
        TestStepResult testStepResult = new TestStepResult();
        if (!StringUtils.isEmpty(result)) {
            testStepResult.setResult(result);
        }
        testResult.addStepResult(order, testStepResult);
    }

    public TestStepResult getCurrentStepresult() {
        return testResult.getStepresults().get(order);
    }
}
