package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

/* compiled from: dalvik_source_com.waze.apk */
public class PACLConfigCreator implements Creator<PACLConfig> {
    public static final int CONTENT_DESCRIPTION = 0;

    static void zza(PACLConfig $r0, Parcel $r1, int i) throws  {
        i = zzb.zzea($r1);
        zzb.zzc($r1, 1, $r0.version);
        zzb.zza($r1, 2, $r0.iH, false);
        zzb.zza($r1, 3, $r0.iI, false);
        zzb.zzaj($r1, i);
    }

    public PACLConfig createFromParcel(Parcel $r1) throws  {
        String $r2 = null;
        int $i0 = zza.zzdz($r1);
        int $i1 = 0;
        String $r3 = null;
        while ($r1.dataPosition() < $i0) {
            int $i2 = zza.zzdy($r1);
            switch (zza.zziv($i2)) {
                case 1:
                    $i1 = zza.zzg($r1, $i2);
                    break;
                case 2:
                    $r3 = zza.zzq($r1, $i2);
                    break;
                case 3:
                    $r2 = zza.zzq($r1, $i2);
                    break;
                default:
                    zza.zzb($r1, $i2);
                    break;
            }
        }
        if ($r1.dataPosition() == $i0) {
            return new PACLConfig($i1, $r3, $r2);
        }
        throw new zza.zza("Overread allowed size end=" + $i0, $r1);
    }

    public PACLConfig[] newArray(int $i0) throws  {
        return new PACLConfig[$i0];
    }
}
