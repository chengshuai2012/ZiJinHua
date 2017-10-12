package ofx.myapplication.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

import ofx.myapplication.R;
import ofx.myapplication.bean.AdvBean;
import ofx.myapplication.bean.RoomListBean;
import ofx.myapplication.bean.TotalCount;
import ofx.myapplication.method.GetAvd;
import ofx.myapplication.method.GetRoomList;
import ofx.myapplication.method.GetTotalCount;
import ofx.myapplication.util.GlideImageLoader;
import ofx.myapplication.util.URL;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements OnBannerListener {
    TextView total_count;
    Banner banner;
    GridView home_grid;
    Retrofit retrofit = new Retrofit.Builder().baseUrl(URL.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    private List<RoomListBean.DataBean> roomList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            roomList.clear();
            roomList.addAll((List<RoomListBean.DataBean>) msg.obj);
            adapter.notifyDataSetChanged();
        }
    };
    public void initView(){
        total_count= (TextView) findViewById(R.id.total_count);
        banner= (Banner) findViewById(R.id.banner);
        home_grid= (GridView) findViewById(R.id.home_grid);
        adapter=new GridAdapter();
        home_grid.setAdapter(adapter);
        home_grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intend =new Intent(MainActivity.this,ZhiBoAcitivty.class);
                intend.putExtra("RoomID",roomList.get(position).getRoomNo());
                startActivity(intend);
            }
        });
    }
    GridAdapter adapter ;
    class GridAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return roomList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view =null;
            if(convertView==null){
                view=View.inflate(MainActivity.this,R.layout.room_item,null);

            }else {
                view=convertView;

            }
            ImageView image = (ImageView) view.findViewById(R.id.imageView);
            TextView name = (TextView) view.findViewById(R.id.name);
            TextView number = (TextView) view.findViewById(R.id.number);
            TextView status = (TextView) view.findViewById(R.id.status);
            Glide.with(MainActivity.this).load(roomList.get(position).getRoomImage()).into(image);
            name.setText(roomList.get(position).getRoomTitle());
            number.setText(roomList.get(position).getOnlineUserCount()+"");
            if(roomList.get(position).getVdoStatus().equals("1")){
                status.setText("直播中…");
            }else {
                status.setText("休息中…");
            }
            return view;
        }
    }
    public void initData(){
        GetAvd getAvd = retrofit.create(GetAvd.class);
        Call<AdvBean> avd = getAvd.getAvd("home_head", "PC");
        avd.enqueue(new Callback<AdvBean>() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onResponse(Call<AdvBean> call, Response<AdvBean> response) {
                if(response.body().getStatus()==200){
                    List<AdvBean.DataBean.AdPicVOListBean> adPicVOList = response.body().getData().get(0).getAdPicVOList();
                    List<String> list = new ArrayList<String>();
                    for(int x =0;x<adPicVOList.size();x++){
                        list.add(adPicVOList.get(x).getPicUrl());
                    }
                    banner.setBackground(null);
                    banner.setImageLoader(new GlideImageLoader())
                            .setDelayTime(3000)
                            .setOnBannerListener(MainActivity.this) //点击事件
                            .setImages(list)
                            .setBannerStyle(BannerConfig.CIRCLE_INDICATOR)
                            .setBannerAnimation(Transformer.Default)
                            .start();
                }
            }

            @Override
            public void onFailure(Call<AdvBean> call, Throwable t) {

            }
        });
        GetTotalCount getTotalCount = retrofit.create(GetTotalCount.class);
         Call<TotalCount> totalCount = getTotalCount.getTotalCount();
        totalCount.enqueue(new Callback<TotalCount>() {
            @Override
            public void onResponse(Call<TotalCount> call, Response<TotalCount> response) {
                if(response.body().getStatus()==200){
                    total_count.setText(response.body().getData()+"");
                }
            }

            @Override
            public void onFailure(Call<TotalCount> call, Throwable t) {

            }
        });
        GetRoomList getRoomList = retrofit.create(GetRoomList.class);
        Call<RoomListBean> roomList = getRoomList.getRoomList();
        roomList.enqueue(new Callback<RoomListBean>() {
            @Override
            public void onResponse(Call<RoomListBean> call, Response<RoomListBean> response) {
                Message msg = Message.obtain();
                msg.obj=response.body().getData();
                handler.sendMessage(msg);
            }


            @Override
            public void onFailure(Call<RoomListBean> call, Throwable t) {

            }
        });
    }

    @Override
    public void OnBannerClick(int position) {

    }
}
