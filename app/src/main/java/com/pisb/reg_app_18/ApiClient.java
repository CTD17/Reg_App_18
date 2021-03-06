package com.pisb.reg_app_18;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiClient {
//    public static final String BASE_URL = "https://app.credenz.info/";
    public static final String BASE_URL = "http://webone.tk/app/";
    @FormUrlEncoded
    @POST("restapi.php")
    Call<List<DataRecv>> sendData(
                                @Field("vphone") String vphone,
                                @Field("gname") String gname,
                                @Field("name1") String name,
                                @Field("name2") String name2,
                                @Field("name3") String name3,
                                @Field("name4") String name4,
                                @Field("email") String email,
                                @Field("email2") String email2,
                                @Field("email3") String email3,
                                @Field("email4") String email4,
                                @Field("phone") String phone,
                                @Field("date") String date,
                                @Field("total") int total,
                                @Field("college") String college,
                                @Field("ieee") int ieee,
                                @Field("BPlan") int BPlan,
                                @Field("Contraption") int Contraption,
                                @Field("Clash") int Clash,
                                @Field("Cretronix") int Cretronix,
                                @Field("Datawiz") int Datawiz,
                                @Field("Enigma") int Enigma,
                                @Field("NTH") int NTH,
                                @Field("paperPresentation") int paperPresentation,
                                @Field("Pixelate") int Pixelate,
                                @Field("Roboliga") int Roboliga,
                                @Field("Reverse_Coding") int Reverse_Coding,
                                @Field("QuizB") int QuizB,
                                @Field("QuizG") int QuizG,
                                @Field("QuizM") int QuizM,
                                @Field("Software_Development") int Software_Development,
                                @Field("WebWeaver") int WebWeaver,
                                @Field("WallStreet") int WallStreet,
                                @Field("Xodia") int Xodia);

    @FormUrlEncoded
    @POST("check.php")
    Call<List<DataRecv>> checkData(@Field("phone")String phone);
}
