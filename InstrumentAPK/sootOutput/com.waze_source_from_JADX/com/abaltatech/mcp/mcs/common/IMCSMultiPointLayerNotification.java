package com.abaltatech.mcp.mcs.common;

public interface IMCSMultiPointLayerNotification {
    void newConnectionRequested(IMCSMultiPointLayer iMCSMultiPointLayer, IMCSConnectionAddress iMCSConnectionAddress, IMCSConnectionAddress iMCSConnectionAddress2, byte[] bArr) throws ;

    void onConnectionClosed(IMCSDataLayer iMCSDataLayer, IMCSConnectionAddress iMCSConnectionAddress, IMCSConnectionAddress iMCSConnectionAddress2) throws ;
}
