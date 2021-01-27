package project03.service;

/**
 * @author yong
 * @date 2021-01-27 오전 9:52
 * @mail yongri1115@163.com
 */
public class Status {
    private final String NAME;

    private Status(String name) {
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");
}
