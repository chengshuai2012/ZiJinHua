package ofx.myapplication.bean;

import java.util.List;

/**
 * Created by 49488 on 2017/10/12.
 */

public class RoomListBean {

    /**
     * data : [{"addressUrl":"","isPrivate":"0","maxLimit":500,"onlineUserCount":196,"roomImage":"http://file.wenyinga.com/picture/3871e43e93a9413e915b013e96bfd475.jpg","roomNo":"DD60DAB8BF269769","roomTitle":"第一赛区-传奇股经","vdoStatus":"1"},{"addressUrl":"","isPrivate":"1","maxLimit":500,"onlineUserCount":1,"roomImage":"http://file.wenyinga.com/picture/a939b4caf5b0457aa16bd2fd1eb76ca3.jpg","roomNo":"3C1104BA18A378AC","roomTitle":"第二赛区-百川股海","vdoStatus":"1"},{"addressUrl":"","isPrivate":"0","maxLimit":500,"onlineUserCount":348,"roomImage":"http://file.wenyinga.com/picture/e87a7508ef0b4c058ae4847c6422a093.jpg","roomNo":"F92B9B072AD288EB","roomTitle":"第三赛区-涨停天下","vdoStatus":"1"},{"addressUrl":"","isPrivate":"1","maxLimit":500,"onlineUserCount":384,"roomImage":"http://file.wenyinga.com/picture/09628e290fc042bb92ab1b1864462472.jpg","roomNo":"40D8C1A9259E8EEB","roomTitle":"第四赛区-股市大赢家","vdoStatus":"1"},{"addressUrl":"","isPrivate":"1","maxLimit":500,"onlineUserCount":1,"roomImage":"http://file.wenyinga.com/picture/d3b565b16dc741f7a1e11fb2fef3b76e.jpg","roomNo":"588186C4AEF5F1B6","roomTitle":"第五赛区-畅游股海","vdoStatus":"1"},{"addressUrl":"","isPrivate":"1","maxLimit":500,"onlineUserCount":261,"roomImage":"http://file.wenyinga.com/picture/fcf44096c5334de780a19a764790524b.jpg","roomNo":"EFD96CDA1093993F","roomTitle":"第六赛区-涨停之王","vdoStatus":"1"},{"addressUrl":"","isPrivate":"1","maxLimit":500,"onlineUserCount":1,"roomImage":"http://file.wenyinga.com/picture/846a636db883479cbb68aed6f2d70626.jpg","roomNo":"6ECA62AE14D5B88F","roomTitle":"第七赛区-股道飘香","vdoStatus":"1"},{"addressUrl":"","isPrivate":"0","maxLimit":500,"onlineUserCount":184,"roomImage":"http://file.wenyinga.com/picture/27fac6da7b7e434d92a3bfbeac4eb96c.jpg","roomNo":"267929AC9283417E","roomTitle":"第八赛区-短线出击","vdoStatus":"1"},{"addressUrl":"","isPrivate":"1","maxLimit":500,"onlineUserCount":1,"roomImage":"http://file.wenyinga.com/picture/feaf3af97e8f4c199b9edad87db43b96.jpg","roomNo":"25421B8EF4379415","roomTitle":"第二十八赛区-御股轩","vdoStatus":"1"},{"addressUrl":"","isPrivate":"0","maxLimit":500,"onlineUserCount":3,"roomImage":"http://file.wenyinga.com/picture/ed7949776d7e46cfab5143802c8883ab.jpg","roomNo":"33FDEBAB525520A9","roomTitle":"第二十九赛区-战必胜","vdoStatus":"1"},{"addressUrl":"","isPrivate":"0","maxLimit":500,"onlineUserCount":0,"roomImage":"http://file.wenyinga.com/picture/0d1218290a13438987f26e16d1f1230e.jpg","roomNo":"9693CC4E30466F0A","roomTitle":"第三十赛区-纵横股海","vdoStatus":"0"}]
     * datestamp : 1507810773898
     * message : 操作成功
     * status : 200
     * total : null
     */

    private long datestamp;
    private String message;
    private int status;
    private Object total;
    private List<DataBean> data;

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

    public Object getTotal() {
        return total;
    }

    public void setTotal(Object total) {
        this.total = total;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * addressUrl :
         * isPrivate : 0
         * maxLimit : 500
         * onlineUserCount : 196
         * roomImage : http://file.wenyinga.com/picture/3871e43e93a9413e915b013e96bfd475.jpg
         * roomNo : DD60DAB8BF269769
         * roomTitle : 第一赛区-传奇股经
         * vdoStatus : 1
         */

        private String addressUrl;
        private String isPrivate;
        private int maxLimit;
        private int onlineUserCount;
        private String roomImage;
        private String roomNo;
        private String roomTitle;
        private String vdoStatus;

        public String getAddressUrl() {
            return addressUrl;
        }

        public void setAddressUrl(String addressUrl) {
            this.addressUrl = addressUrl;
        }

        public String getIsPrivate() {
            return isPrivate;
        }

        public void setIsPrivate(String isPrivate) {
            this.isPrivate = isPrivate;
        }

        public int getMaxLimit() {
            return maxLimit;
        }

        public void setMaxLimit(int maxLimit) {
            this.maxLimit = maxLimit;
        }

        public int getOnlineUserCount() {
            return onlineUserCount;
        }

        public void setOnlineUserCount(int onlineUserCount) {
            this.onlineUserCount = onlineUserCount;
        }

        public String getRoomImage() {
            return roomImage;
        }

        public void setRoomImage(String roomImage) {
            this.roomImage = roomImage;
        }

        public String getRoomNo() {
            return roomNo;
        }

        public void setRoomNo(String roomNo) {
            this.roomNo = roomNo;
        }

        public String getRoomTitle() {
            return roomTitle;
        }

        public void setRoomTitle(String roomTitle) {
            this.roomTitle = roomTitle;
        }

        public String getVdoStatus() {
            return vdoStatus;
        }

        public void setVdoStatus(String vdoStatus) {
            this.vdoStatus = vdoStatus;
        }
    }
}
