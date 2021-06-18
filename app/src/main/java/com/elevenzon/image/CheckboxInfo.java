package com.elevenzon.image;

import java.io.Serializable;

public class CheckboxInfo implements Serializable {

    public String checkboxNo;
    public String checkboxName;
    public String checkboxAnswer;
    public String checkboxChoice;
    public String checkboxRow;
    public String eachNoAmount;
    public String eachLineAmount;
    public String checkboxTotal;


    public CheckboxInfo() {

    }

    public CheckboxInfo(String checkboxNo, String checkboxName, String checkboxAnswer, String checkboxChoice, String checkboxRow, String eachNoAmount, String eachLineAmount, String checkboxTotal) {
        this.checkboxNo = checkboxNo;
        this.checkboxName = checkboxName;
        this.checkboxAnswer = checkboxAnswer;
        this.checkboxChoice = checkboxChoice;
        this.checkboxRow = checkboxRow;
        this.eachNoAmount = eachNoAmount;
        this.eachLineAmount = eachLineAmount;
        this.checkboxTotal = checkboxTotal;
    }
    //มีคำถาม checkbox กี่ข้อ
    public String getCheckboxNo() {
        return checkboxNo;
    }
    public void setCheckboxNo(String checkboxNo) { this.checkboxNo = checkboxNo; }

    //คำถาม
    public String getCheckboxName() {
        return checkboxName;
    }
    public void setCheckboxName(String checkboxName) {
        this.checkboxName = checkboxName;
    }

    //คำตอบ
    public String getCheckboxAnswer() { return checkboxAnswer; }
    public void setCheckboxAnswer(String checkboxAnswer) {
        this.checkboxAnswer = checkboxAnswer;
    }

    //ชื่อคำตอบ
    public String getCheckboxChoice() { return checkboxChoice; }
    public void setCheckboxChoice(String checkboxChoice) {
        this.checkboxChoice = checkboxChoice;
    }

    //อยู่บรรทัดไหน
    public String getCheckboxRow() { return checkboxRow; }
    public void setCheckboxRow(String checkboxRow) { this.checkboxRow = checkboxRow; }

    //แต่ละข้อมีกี่ checkbox
    public String getEachNoAmount() {
        return eachNoAmount;
    }
    public void setEachNoAmount(String eachNoAmount) { this.eachNoAmount = eachNoAmount; }

    //แต่ละบรรทัดมีกี่ checkbox
    public String getEachLineAmount() {
        return eachLineAmount;
    }
    public void setEachLineAmount(String eachLineAmount) {
        this.eachLineAmount = eachLineAmount;
    }

    //มี checkbox ทั้งหมดเท่าไหร่
    public String getCheckboxTotal() { return checkboxTotal; }
    public void setCheckboxTotal(String checkboxTotal) {
        this.checkboxTotal = checkboxTotal;
    }

}