package com.koushikdutta.klaxon;

import com.antlersoft.android.db.FieldAccessor;
import com.antlersoft.android.db.TableInterface;


@TableInterface(ImplementingClassName="AlarmSettingsBase",TableName="AlarmSettings")  
public interface IAlarmSettings {
    @FieldAccessor(Name="_id")
    long get_Id();
   
    @FieldAccessor
    boolean getEnabled();

    @FieldAccessor
    boolean getVibrateEnabled();

    @FieldAccessor
    int getAlarmDaysBase();
    
    @FieldAccessor
    int getHour();
    
    @FieldAccessor
    int getMinutes();
    
    @FieldAccessor
    String getRingtoneBase();
    
    @FieldAccessor
    int getSnoozeTime();
    
    @FieldAccessor
    long getNextSnooze();
    
    @FieldAccessor
    int getVolume();
    
    @FieldAccessor
    int getVolumeRamp();
    
    @FieldAccessor
    String getName();

    @FieldAccessor
    String getSleepMode();

    @FieldAccessor
    int getSleepLeadTime();

    @FieldAccessor
    int getExpireTime();

    @FieldAccessor
    String getIntent();
}
