package oops.enums;

public enum EnumAbstract {
    MONDAY {
        public void dummyMethod() {
            System.out.println("in Monday");

        }
    },
    TUESDAY {
        public void dummyMethod() {
            System.out.println("In TUESDAY");
        }
    },
    SUNDAY {
        public void dummyMethod() {
            System.out.println("In SUNDAY");
        }
    };

    public abstract void dummyMethod();
}


