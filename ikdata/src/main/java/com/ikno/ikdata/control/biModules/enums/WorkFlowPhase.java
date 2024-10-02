package com.ikno.ikdata.control.biModules.enums;

public enum WorkFlowPhase {

    PRE_CLASSIFY("preclassify"),
    PRE_EXTRACT("preextract"),
    VALIDATE("validate"),
    HOMOLOGATE("homologate"),
    VERIFY_LOG("verifylog"),
    FUNCTION_KEY("functionkey"),
    PROJECT_CHANGE("projectchange"),
    POST_VALIDATE("postvalidate"),
    EXPORT("export");

    private final String scriptName;

    WorkFlowPhase(String scriptName){
        this.scriptName = scriptName;
    }

    public String getScriptName(){
        return scriptName;
    }

}
