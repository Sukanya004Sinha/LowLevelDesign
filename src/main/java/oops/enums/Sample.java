package oops.enums;

public enum Sample {
    MONDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Monday dummy Method");

        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public void dummyMethod(){
        System.out.println("Default dummy Method");
    }





}
