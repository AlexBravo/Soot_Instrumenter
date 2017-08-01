package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

/* compiled from: dalvik_source_com.waze.apk */
public class OtpResponseCreator implements Creator<OtpResponse> {
    public static final int CONTENT_DESCRIPTION = 0;

    static void zza(OtpResponse $r0, Parcel $r1, int i) throws  {
        i = zzb.zzea($r1);
        zzb.zzc($r1, 1, $r0.mVersion);
        zzb.zza($r1, 2, $r0.otp, false);
        zzb.zzaj($r1, i);
    }

    public OtpResponse createFromParcel(Parcel $r1) throws  {
        int $i0 = zza.zzdz($r1);
        int $i1 = 0;
        String $r2 = null;
        while ($r1.dataPosition() < $i0) {
            int $i2 = zza.zzdy($r1);
            switch (zza.zziv($i2)) {
                case 1:
                    $i1 = zza.zzg($r1, $i2);
                    break;
                case 2:
                    $r2 = zza.zzq($r1, $i2);
                    break;
                default:
                    zza.zzb($r1, $i2);
                    break;
            }
        }
        if ($r1.dataPosition() == $i0) {
            return new OtpResponse($i1, $r2);
        }
        throw new zza.zza("Overread allowed size end=" + $i0, $r1);
    }

    public OtpResponse[] newArray(int $i0) throws  {
        return new OtpResponse[$i0];
    }
}
