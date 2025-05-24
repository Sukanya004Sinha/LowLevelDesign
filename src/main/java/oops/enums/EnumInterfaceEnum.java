package oops.enums;

public enum EnumInterfaceEnum implements EnumInterface{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
