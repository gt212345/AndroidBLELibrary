package com.ppsoc.hrw.AndroidBLE;

import android.content.Context;
import android.os.Bundle;

import com.unity3d.player.UnityPlayerActivity;


public class BLESetupActivity extends UnityPlayerActivity {
    BLESetupWizard bleSetupWizard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void setUpBLE(Context context) {
        bleSetupWizard = new BLESetupWizard(context);
    }

    public void setDeviceName(String DEVICE_NAME) {
        bleSetupWizard.setDeviceName(DEVICE_NAME);
    }

    public void setOnDataTransferListener (OnDataTransferListener listener) {
        bleSetupWizard.setOnDataTransferListener(listener);
    }
    public void setCC(boolean isCC) {
        bleSetupWizard.setCC(isCC);
    }

    public void startScan(int millisecond){
        bleSetupWizard.startScanning(millisecond);
    }

}
