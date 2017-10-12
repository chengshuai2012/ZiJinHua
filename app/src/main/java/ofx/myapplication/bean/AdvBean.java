package ofx.myapplication.bean;

import java.util.List;

/**
 * Created by 49488 on 2017/10/11.
 */

public class AdvBean {

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

        private String adDesc;
        private String adTitle;
        private String linkUrl;
        private int simuHeight;
        private String simuPicUrl;
        private int simuWidth;
        private List<AdPicVOListBean> adPicVOList;

        public String getAdDesc() {
            return adDesc;
        }

        public void setAdDesc(String adDesc) {
            this.adDesc = adDesc;
        }

        public String getAdTitle() {
            return adTitle;
        }

        public void setAdTitle(String adTitle) {
            this.adTitle = adTitle;
        }

        public String getLinkUrl() {
            return linkUrl;
        }

        public void setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
        }

        public int getSimuHeight() {
            return simuHeight;
        }

        public void setSimuHeight(int simuHeight) {
            this.simuHeight = simuHeight;
        }

        public String getSimuPicUrl() {
            return simuPicUrl;
        }

        public void setSimuPicUrl(String simuPicUrl) {
            this.simuPicUrl = simuPicUrl;
        }

        public int getSimuWidth() {
            return simuWidth;
        }

        public void setSimuWidth(int simuWidth) {
            this.simuWidth = simuWidth;
        }

        public List<AdPicVOListBean> getAdPicVOList() {
            return adPicVOList;
        }

        public void setAdPicVOList(List<AdPicVOListBean> adPicVOList) {
            this.adPicVOList = adPicVOList;
        }

        public static class AdPicVOListBean {
            /**
             * picHeight : 200
             * picSort : 1
             * picUrl : http://file.wenyinga.com/picture/25faac21132543e4abee70d01b1b6ca4.jpg
             * picWidth : 800
             */

            private int picHeight;
            private int picSort;
            private String picUrl;
            private int picWidth;

            public int getPicHeight() {
                return picHeight;
            }

            public void setPicHeight(int picHeight) {
                this.picHeight = picHeight;
            }

            public int getPicSort() {
                return picSort;
            }

            public void setPicSort(int picSort) {
                this.picSort = picSort;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public int getPicWidth() {
                return picWidth;
            }

            public void setPicWidth(int picWidth) {
                this.picWidth = picWidth;
            }
        }
    }
}
