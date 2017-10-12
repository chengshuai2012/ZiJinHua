package ofx.myapplication.method;

import ofx.myapplication.bean.TotalCount;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by 49488 on 2017/10/11.
 */

public interface GetTotalCount {
    @GET("chat/getTotalCount")
    Call<TotalCount>getTotalCount();
}
