package service.dto;

public enum SeasonEnum {
    SPRING(1,"春天"),
    AUTOMN(2,"夏天");
    private Integer code;
    private String desc;

    SeasonEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
