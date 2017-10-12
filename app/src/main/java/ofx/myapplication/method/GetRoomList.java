package ofx.myapplication.method;

import ofx.myapplication.bean.RoomListBean;
import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by 49488 on 2017/10/12.
 */

public interface GetRoomList {
    @POST("chat/getRoomList")
    Call<RoomListBean>getRoomList();
}
