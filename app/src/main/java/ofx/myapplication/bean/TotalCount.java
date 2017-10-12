package ofx.myapplication.bean;

/**
 * Created by 49488 on 2017/10/11.
 */

public class TotalCount {


    private int data;
    private long datestamp;
    private String message;
    private int status;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public long getDatestamp() {
        return datestamp;
    }

    public void setDatestamp(long datestamp) {
        this.datestamp = datestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
