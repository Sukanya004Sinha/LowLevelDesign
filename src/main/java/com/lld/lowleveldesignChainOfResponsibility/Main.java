package com.lld.lowleveldesignChainOfResponsibility;

public class Main {
    public static void main(String[] args){
        LogProcessor logObect = new LogProcessor(new InfoLogProcessor
                (new ErrorLogProcessor(null)));
        logObect.log(LogProcessor.ERROR, "exception happens");
        logObect.log(LogProcessor.DEBUG, "need to debug this");
        logObect.log(LogProcessor.INFO, "Just for Info");
    }
}
