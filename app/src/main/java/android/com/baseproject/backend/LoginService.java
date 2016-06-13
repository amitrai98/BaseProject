package android.com.baseproject.backend;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by amitrai on 13/6/16.
 */

public interface LoginService {

    @POST("/api/v1/authenticate?apiKey=f92ecd00-d3ed-11e2-a6db-e9a269320bf6")
    Call<String> getToken(@Query("username") String username,
                          @Query("password") String password);

}
