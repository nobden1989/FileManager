package com.example.nedias.filemanager.entites;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

import java.math.BigDecimal;

/**
 * Created by Nedias on 2016/11/10.
 */

public class TestSugarEntity extends SugarRecord {

    @Unique
    private Integer testPrimary;
    private String testChar;
    private String testText;
    private Boolean testBool;
    private BigDecimal testDecimal;
    private Double testNum;

    public TestSugarEntity() {
    }

    public TestSugarEntity(Integer testPrimary, String testChar, String testText, Boolean
            testBool, BigDecimal testDecimal, Double testNum) {
        this.testPrimary = testPrimary;
        this.testChar = testChar;
        this.testText = testText;
        this.testBool = testBool;
        this.testDecimal = testDecimal;
        this.testNum = testNum;
    }

    public Integer getTestPrimary() {
        return testPrimary;
    }

    public void setTestPrimary(Integer testPrimary) {
        this.testPrimary = testPrimary;
    }

    public String getTestChar() {
        return testChar;
    }

    public void setTestChar(String testChar) {
        this.testChar = testChar;
    }

    public String getTestText() {
        return testText;
    }

    public void setTestText(String testText) {
        this.testText = testText;
    }

    public Boolean getTestBool() {
        return testBool;
    }

    public void setTestBool(Boolean testBool) {
        this.testBool = testBool;
    }

    public BigDecimal getTestDecimal() {
        return testDecimal;
    }

    public void setTestDecimal(BigDecimal testDecimal) {
        this.testDecimal = testDecimal;
    }

    public Double getTestNum() {
        return testNum;
    }

    public void setTestNum(Double testNum) {
        this.testNum = testNum;
    }


}
