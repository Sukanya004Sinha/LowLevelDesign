package oops.enums;

public enum EnumCustom {
    MONDAY(101, "1st day of week"),
    TUESDAY(102, "2nd day of week"),
    WEDNESDAY(103, "3rd day of week"),
    THURSDAY(104, "4th day of week"),
    FRIDAY(105, "5th day of week"),
    SATURDAY(106, "6th day of week"),
    SUNDAY(107, "7th day of week");

    private int val;
    private String description;

    EnumCustom(int val, String description) {
        this.val = val;
        this.description = description;
    }

    EnumCustom() {
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static EnumCustom getEnumFromValue(int value) {
        for (EnumCustom day : EnumCustom.values()) {
            if (day.getVal() == value) {
                return day;
            }
        }
        return null; // or throw an exception if preferred
    }
}
