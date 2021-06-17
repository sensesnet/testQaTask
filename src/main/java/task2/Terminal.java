package task2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Terminal {
    @JsonProperty("TID")
    private String tid;

    @JsonProperty("LID")
    private String lid;

    @JsonProperty("MID")
    private String mid;

    public Terminal(String tid, String lid, String mid) {
        this.tid = tid;
        this.lid = lid;
        this.mid = mid;
    }

    public Terminal() {
        this.tid = "";
        this.lid = "";
        this.mid = "";
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "tib='" + tid + '\'' +
                ", lid='" + lid + '\'' +
                ", mid='" + mid + '\'' +
                '}';
    }

}
