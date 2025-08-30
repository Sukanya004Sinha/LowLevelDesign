package com.lld.lowleveldesignChainOfResponsibility;

public class DebugLogProcessor extends  LogProcessor{
    DebugLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);}

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == DEBUG){
            System.out.println("DEBUG: " +message);
        super.log(logLevel, message);
    }
}
}
