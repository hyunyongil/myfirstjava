package project03.domain;

/**
 * @author yong
 * @date 2021-01-27 오전 9:45
 * @mail yongri1115@163.com
 */
public class Printer implements Equipment {
    private String name;
    private String type;

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Printer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
