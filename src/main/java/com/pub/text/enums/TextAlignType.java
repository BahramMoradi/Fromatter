package com.pub.text.enums;

import com.pub.text.impl.Align;
import com.pub.text.impl.CenterAlign;
import com.pub.text.impl.LeftAlign;
import com.pub.text.impl.RightAlign;

public enum TextAlignType {
    CENTER("center"){
        @Override
        public Align getTextAlignInstance() {
            return new CenterAlign();
        }
    },
    LEFT("left"){
        @Override
        public Align getTextAlignInstance() {
            return new LeftAlign();
        }
    },
    RIGHT("right") {
        @Override
        public Align getTextAlignInstance() {
            return new RightAlign();
        }
    };

    private String type;
    public abstract Align getTextAlignInstance();

    TextAlignType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
}
