package springcloud.stack.eureka.client.model;

import java.time.LocalDateTime;

public class DataMsg {
    private String title;
    private String conten;
    private LocalDateTime time;

    public DataMsg(String title, String conten) {
        this.title = title;
        this.conten = conten;
        time = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
