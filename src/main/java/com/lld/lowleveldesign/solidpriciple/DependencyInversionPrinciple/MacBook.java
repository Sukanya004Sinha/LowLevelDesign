package com.lld.lowleveldesign.solidpriciple.DependencyInversionPrinciple;

public class MacBook {
//    private final WiredKeyboard keyboard;
//    private final WiredMouse mouse;
//
//    public MacBook(){
//        Keyboard = new WiredKeyboard();
//        mouse= new WiredMouse();

    // This is the wrong way
//    }

    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

