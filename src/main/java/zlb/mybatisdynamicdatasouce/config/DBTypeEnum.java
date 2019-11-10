package zlb.mybatisdynamicdatasouce.config;

public enum DBTypeEnum {
    write("write"), read1("read1");
    private String value;

    DBTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}