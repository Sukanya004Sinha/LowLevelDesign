package oops.javaClasses;

public class Test {
    public static void main(String[] args){
        AnonymousInnerClass audiCarObj = new AnonymousInnerClass() {
            @Override
          public void pressBreak(){
                System.out.println("Anonymous Inner Class");
            }
        };
      audiCarObj.pressBreak();
        /**
         * 2 things happened behind the scene
         * subclass is created name decided by compiler
         * created an object of subclass and assign its reference to object of audiCarObj
         *
         */
    }

}
