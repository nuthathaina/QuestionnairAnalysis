package com.elevenzon.image;

import java.io.Serializable;

public class Questionnaire implements Serializable {

    public String questionnaireNo, questionnaireName, checkboxAmount, satisAmount, levelFrom, levelTo;

    public Questionnaire() { }

    public Questionnaire(String questionnaireNo, String questionnaireName, String checkboxAmount, String satisAmount, String levelFrom, String levelTo) {
        this.questionnaireNo = questionnaireNo;
        this.questionnaireName = questionnaireName;
        this.checkboxAmount = checkboxAmount;
        this.satisAmount = satisAmount;
//        this.tableRow = tableRow;
//        this.tableColumn = tableColumn;
        this.levelFrom = levelFrom;
        this.levelTo = levelTo;
    }

    public String getQuestionnaireNo() {
        return questionnaireNo;
    }
    public void setQuestionnaireNo(String questionnaireNo) { this.questionnaireNo = questionnaireNo; }

    public String getQuestionnaireName() {
        return questionnaireName;
    }
    public void setQuestionnaireName(String questionnaireName) { this.questionnaireName = questionnaireName; }

    public String getCheckboxAmount() {
        return checkboxAmount;
    }
    public void setCheckboxAmount(String checkboxAmount) { this.checkboxAmount = checkboxAmount; }

    public String getSatisAmount() {
        return satisAmount;
    }
    public void setSatisAmount(String satisAmount) {
        this.satisAmount = satisAmount;
    }

    public String getLevelFrom() {
        return levelFrom;
    }
    public void setLevelFrom(String levelFrom) {
        this.levelFrom = levelFrom;
    }

    public String getLevelTo() {
        return levelTo;
    }
    public void setLevelTo(String levelTo) {
        this.levelTo = levelTo;
    }

//    public String getTableRow() {
//        return tableRow;
//    }
//    public void setTableRow(String tableRow) {
//        this.tableRow = tableRow;
//    }

//    public String getTableColumn() {
//        return tableColumn;
//    }
//    public void setTableColumn(String tableColumn) {
//        this.tableColumn = tableColumn;
//    }

}