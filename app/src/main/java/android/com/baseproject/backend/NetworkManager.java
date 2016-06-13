package android.com.baseproject.backend;

import android.com.baseproject.listener.LoginListener;
import android.com.baseproject.utility.AppConstants;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by amitrai on 13/6/16.
 */

public class NetworkManager {

    private static final String TAG = NetworkManager.class.getSimpleName();


    /**
     * attempts for login
     */
    public static void attemptLogin(String username, String password, LoginListener listener){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        LoginService service = retrofit.create(LoginService.class);

        Call<String> call = service.getToken(username, password);

        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.e(TAG, "success");
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e(TAG, "failure");
            }
        });

    }
}
