package com.github.quadflask.react.navermap;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.naver.maps.map.NaverMapOptions;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.CameraPosition;

public class RNNaverMapViewTextureManager extends RNNaverMapViewManager {
    public RNNaverMapViewTextureManager(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "RNNaverMapViewTexture";
    }

    @Override
    protected NaverMapOptions getNaverMapViewOptions() {
        return new NaverMapOptions()
                .useTextureView(true)
                .translucentTextureSurface(true)
                .camera(new CameraPosition(new LatLng(35.1798159, 129.0750222), 14));
    }
}
