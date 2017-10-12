package ofx.myapplication.method;

import ofx.myapplication.bean.AdvBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by 49488 on 2017/10/11.
 */

public interface GetAvd {
    @GET("chat/getAdvert")
    Call<AdvBean>getAvd(@Query("location")String location,@Query("terminalType")String terminalType);
}
