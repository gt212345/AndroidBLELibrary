# AndroidBLELibrary

###Usage###

    setUpBLE(Context context);
    setDeviceName(String DEVICE_NAME);//not necessary
    setOnDataTransferListener(OnDataTransferListener listener);
    startScan(int scanperiod);
    
Default device name:GigaFu-F081.  
Scan period in millisecond.  
implement OnDataTransferListener and override onDataTransfer();  

    @Override
    public void onDataTransfer(int x, int y, int z) {
        //Do what you want to do with the data
    }

