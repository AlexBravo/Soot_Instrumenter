package com.google.android.gms.plus.service.v2whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.plus.service.v2whitelisted.models.Person.LegacyFields;
import java.util.HashSet;
import java.util.Set;

/* compiled from: dalvik_source_com.waze.apk */
public class zzae implements Creator<LegacyFields> {
    static void zza(LegacyFields $r0, Parcel $r1, int i) throws  {
        i = zzb.zzea($r1);
        Set $r2 = $r0.aOu;
        if ($r2.contains(Integer.valueOf(1))) {
            zzb.zzc($r1, 1, $r0.mVersionCode);
        }
        if ($r2.contains(Integer.valueOf(2))) {
            zzb.zza($r1, 2, $r0.aPn, true);
        }
        zzb.zzaj($r1, i);
    }

    public /* synthetic */ Object createFromParcel(Parcel $r1) throws  {
        return zzws($r1);
    }

    public /* synthetic */ Object[] newArray(int $i0) throws  {
        return zzafv($i0);
    }

    public LegacyFields[] zzafv(int $i0) throws  {
        return new LegacyFields[$i0];
    }

    public LegacyFields zzws(Parcel $r1) throws  {
        int $i0 = zza.zzdz($r1);
        HashSet $r2 = new HashSet();
        int $i1 = 0;
        String $r3 = null;
        while ($r1.dataPosition() < $i0) {
            int $i2 = zza.zzdy($r1);
            switch (zza.zziv($i2)) {
                case 1:
                    $i1 = zza.zzg($r1, $i2);
                    $r2.add(Integer.valueOf(1));
                    break;
                case 2:
                    $r3 = zza.zzq($r1, $i2);
                    $r2.add(Integer.valueOf(2));
                    break;
                default:
                    zza.zzb($r1, $i2);
                    break;
            }
        }
        if ($r1.dataPosition() == $i0) {
            return new LegacyFields($r2, $i1, $r3);
        }
        throw new zza.zza("Overread allowed size end=" + $i0, $r1);
    }
}
