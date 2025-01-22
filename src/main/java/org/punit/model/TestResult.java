package org.punit.model;

public class TestResult {

    private String testName;
    private TestStatus status;
    private String faileMessage;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public TestStatus getStatus() {
        return status;
    }

    public void setStatus(TestStatus status) {
        this.status = status;
    }

    public String getFaileMessage() {
        return faileMessage;
    }

    public void setFaileMessage(String faileMessage) {
        this.faileMessage = faileMessage;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "testName='" + testName + '\'' +
                ", status=" + status +
                ", failMessage='" + faileMessage + '\'' +
                '}';
    }

    public static enum TestStatus {
        PASSED,
        FAILED
    }
}
