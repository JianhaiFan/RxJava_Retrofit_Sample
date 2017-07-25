// (c)2016 Flipboard Inc, All Rights Reserved.

package com.xiaofan.rrs.network.api;


import com.xiaofan.rrs.model.ZhuangbiImage;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ZhuangbiApi {
    @GET("search")
    Observable<List<ZhuangbiImage>> search(@Query("q") String query);
}
