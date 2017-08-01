package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

/* compiled from: dalvik_source_com.waze.apk */
public class ReauthSettingsRequestCreator implements Creator<ReauthSettingsRequest> {
    public static final int CONTENT_DESCRIPTION = 0;

    static void zza(ReauthSettingsRequest $r0, Parcel $r1, int $i0) throws  {
        int $i1 = zzb.zzea($r1);
        zzb.zzc($r1, 1, $r0.version);
        zzb.zza($r1, 2, $r0.accountName, false);
        zzb.zza($r1, 3, $r0.force);
        zzb.zza($r1, 4, $r0.account, $i0, false);
        zzb.zza($r1, 5, $r0.callingPackageName, false);
        zzb.zzaj($r1, $i1);
    }

    public ReauthSettingsRequest createFromParcel(Parcel $r1) throws  {
        boolean $z0 = false;
        String $r2 = null;
        int $i0 = zza.zzdz($r1);
        Account $r3 = null;
        String $r4 = null;
        int $i1 = 0;
        while ($r1.dataPosition() < $i0) {
            int $i2 = zza.zzdy($r1);
            switch (zza.zziv($i2)) {
                case 1:
                    $i1 = zza.zzg($r1, $i2);
                    break;
                case 2:
                    $r4 = zza.zzq($r1, $i2);
                    break;
                case 3:
                    $z0 = zza.zzc($r1, $i2);
                    break;
                case 4:
                    $r3 = (Account) zza.zza($r1, $i2, Account.CREATOR);
                    break;
                case 5:
                    $r2 = zza.zzq($r1, $i2);
                    break;
                default:
                    zza.zzb($r1, $i2);
                    break;
            }
        }
        if ($r1.dataPosition() == $i0) {
            return new ReauthSettingsRequest($i1, $r4, $z0, $r3, $r2);
        }
        throw new zza.zza("Overread allowed size end=" + $i0, $r1);
    }

    public ReauthSettingsRequest[] newArray(int $i0) throws  {
        return new ReauthSettingsRequest[$i0];
    }
}
